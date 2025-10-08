import java.util.HashMap;
import java.util.Iterator;
import java.util.AbstractSet;

public class CustomHashSet<E> extends AbstractSet<E> {

    private HashMap<E, Object> map;
    // A dummy object used as the value in the HashMap, as HashSet only stores keys.
    private static final Object DUMMY_VALUE = new Object(); 

    public CustomHashSet() {
        map = new HashMap<>();
    }

    @Override
    public boolean add(E element) {
        // put() returns null if the key was not present, indicating a new addition.
        return map.put(element, DUMMY_VALUE) == null; 
    }

    @Override
    public boolean contains(Object element) {
        return map.containsKey(element);
    }

    @Override
    public boolean remove(Object element) {
        // remove() returns the value associated with the key, or null if not found.
        return map.remove(element) == DUMMY_VALUE; 
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public static void main(String[] args) {
        CustomHashSet<String> mySet = new CustomHashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");
        mySet.add("Apple"); // Duplicate, will not be added

        System.out.println("Set size: " + mySet.size()); // Output: 3
        System.out.println("Contains Banana? " + mySet.contains("Banana")); // Output: true
        System.out.println("Contains Grape? " + mySet.contains("Grape")); // Output: false

        mySet.remove("Banana");
        System.out.println("Set size after removal: " + mySet.size()); // Output: 2
        System.out.println("Contains Banana? " + mySet.contains("Banana")); // Output: false

        System.out.println("Elements in the set:");
        for (String element : mySet) {
            System.out.println(element);
        }
    }
}