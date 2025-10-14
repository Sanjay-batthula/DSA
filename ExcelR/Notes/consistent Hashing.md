
## Consistent Hashing

It is a technique used in distributed systems to distribute data or requests among a set of servers (nodes) in a way that minimizes the impact when servers are added or removed.
Unlike Traditional Hashing (e.g., hash(key) % num_servers), where adding or removing a server can necessitate remapping a large portion of keys, consistent hashing aims to only remap a small fraction of keys.


What do you mean by scaling of resources? and what is the diff b/w horizontal and vertical scaling?
when to prefer/go for horizontal scaling , and when to prefer vertical scaling?

```
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class ConsistentHashing {
    private final int numberOfReplicas;
    private final SortedMap<Long, String> hashRing = new TreeMap<>();
    private final MessageDigest md;

    public ConsistentHashing(int numberOfReplicas) throws NoSuchAlgorithmException {
        this.numberOfReplicas = numberOfReplicas;
        this.md = MessageDigest.getInstance("MD5");
    }

    private long generateHash(String input) {
        md.reset();
        md.update(input.getBytes());
        byte[] digest = md.digest();
        long hash = 0;
        for (int i = 0; i < 8; i++) hash = (hash << 8) | (digest[i] & 0xFF);
        return hash;
    }

    public void addServer(String server) {
        for (int i = 0; i < numberOfReplicas; i++) {
            long hash = generateHash(server + i);
            hashRing.put(hash, server);
        }
    }

    public void removeServer(String server) {
        for (int i = 0; i < numberOfReplicas; i++) {
            long hash = generateHash(server + i);
            hashRing.remove(hash);
        }
    }

    public String getServer(String key) {
        if (hashRing.isEmpty()) return null; //No servers available
        long keyHash = generateHash(key);
        SortedMap<Long, String> tailMap = hashRing.tailMap(keyHash);
        if (tailMap.isEmpty()) return hashRing.get(hashRing.firstKey());
        return tailMap.get(tailMap.firstKey());
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        ConsistentHashing ch = new ConsistentHashing(3);
        ch.addServer("ServerA");
        ch.addServer("ServerB");
        ch.addServer("ServerC");

        System.out.println("Key 'data1' maps to: " + ch.getServer("data1"));
        System.out.println("Key 'data2' maps to: " + ch.getServer("data2"));
        System.out.println("Key 'data3' maps to: " + ch.getServer("data3"));

        System.out.println("\n Removing ServerB...");
        ch.removeServer("ServerB");
        System.out.println("Key 'data1' now maps to: " + ch.tgetServer("data"));
        System.out.println("Key 'data2' now maps to: " + ch.getServer("data2"));
        System.out.println("Key 'data3' now maps to: " + ch.getServer("data3"));

    }
}

```