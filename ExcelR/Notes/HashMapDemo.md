import java.util.*;


public class HashMapdemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Map<Integer, Resource> mp = new HashMap<>();
        Map<Integer, Resource> mps = new LinkedHashMap<>();

        System.out.println(mp.put(null, null));
        // mp.put(null, null)
        mp.put(200, new Resource(1, "Aaa", "aa@1234", "Student 1"));
        mp.put(201, new Resource(2, "Bbb", "bb@1234", "Student 2"));
        mp.put(202, new Resource(3, "Ccc", "cc@1234", "Student 3"));

        System.out.println("Size of Map: " + mp.size());
        System.out.println("Value of Key: " + 200 + " is " + mp.get(200));

        Set<Integer> keys = mp.keySet();

        System.out.println("************************************");
        for (Integer key : keys) {
            System.out.println(key + " : " + mp.get(key));
        }
        System.out.println("************************************");

        Collection<Resource> resources = mp.values();
        System.out.println("************************************");
        for (Resource resource : resources) {
            System.out.println(resource);
        }
        System.out.println("************************************");
        Set<Map.Entry<Integer, Resource>> entries = aceMap.entrySet();
        for (Map.Entry<Integer, Resource> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("************************************");
        System.out.println(aceMap.containsKey(1001));
        System.out.println(aceMap.containsValue(new Resource(2, "Bbb", "bb@1234", "Student 2")));
        System.out.println(aceMap.isEmpty());
        aceMap.clear();
        System.out.println(aceMap.isEmpty());

    }

}