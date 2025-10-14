```
public class CustomHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16; // Default capacity
    private Entry<K, V>[] buckets; // Array of Entry objects (linked lists)
    private int size = 0; // Number of key-value pairs

    public CustomHashMap() {
        this(INITIAL_CAPACITY);
    }

    public CustomHashMap(int capacity) {
        this.buckets = new Entry[capacity];
    }

    // Hash function to improve distribution
    private int hash(K key) {
        if (key == null) {
            return 0;
        }
        int h = key.hashCode();
        // XOR the hash with its right-shifted value for better distribution
        return h ^ (h >>> 16);
    }

    // Hash function to determine the bucket index
    private int getBucketIndex(K key) {
        return Math.abs(hash(key) % buckets.length);
    }

    // Put method to add or update a key-value pair
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> newEntry = new Entry<>(key, value, null);

        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = newEntry;
            size++;
        } else {
            Entry<K, V> current = buckets[bucketIndex];
            while (current.next != null && !current.key.equals(key)) {
                current = current.next;
            }
            if (current.key.equals(key)) { // Key already exists, update value
                current.value = value;
            } else { // Key not found in chain, add new entry
                current.next = newEntry;
                size++;
            }
        }
        // Consider resizing logic here if load factor exceeds a threshold
    }

    // Get method to retrieve a value by key
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> current = buckets[bucketIndex];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Key not found
    }

    // Remove method (optional, but good for a complete implementation)
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> current = buckets[bucketIndex];
        Entry<K, V> previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) { // Removing the head of the list
                    buckets[bucketIndex] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return current.value;
            }
            previous = current;
            current = current.next;
        }
        return null; // Key not found
    }

    public int size() {
        return size;
    }
}
```