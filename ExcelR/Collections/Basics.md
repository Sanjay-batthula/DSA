```
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 34, -10, 45, 12, 45, 67, 89, 90, 94 };
        int n = 2;
        System.out.println(secondLargest(arr, n));
    }

    static int secondLargest(int[] arr, int n) {
        int smallest = 0;
        if (arr.length == 0) {
            throw new NullPointerException("Array is empty");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n should be non-negative");

        } else {
            SortedSet<Integer> set = new TreeSet<>();
            for (int num : arr) {
                set.add(num);

            }
            System.out.print("MY SET : ");
            System.out.println(set);
            Object[] obj = set.toArray();
            smallest = (int) obj[n - 1];
            return smallest;

        }
    }
}
```


            Iterable
                ||
            Iterator                        Map
                ||                          ||
                ||                       Sorted Map
            Collection
                ||
                ||
    ==========================
    ||          ||          ||
   List        Set          Queue
                ||
            Sorted Set


Collection:
1. Collection interface is a super interface for all the collection interfaces.
2. We can add the elements at end position only
3. Allow us to add duplicates
4. Allow us to add multiple null values
5. Allow us to iterate the data only forwand direction

List:
1. List presernces insertion order.
2. List allows us to add the elements at any given position.
3. List allows us to delete the elements at any given position.
4. List allows duplicates.
5. List allows mutliple null values to be added.
6. List is a bi-directional entity
    Meaning Iterate forward direction -- Iterator?for Each Loop
        Iterate both forward and backward direction -- ListIterator
    LinkedList Class
    ArrayList Class
    Vector(Legacy Collection/Thread Safe)


Set:
1. Set allows only one null value.
2. Set stores the elements in random order.
    if null entry is available, then it will be the first.
3. Set does not allow duplicates.
4. Set allows us to read the data only in forwand direction
    HashSet
    LinkedHashSet (It preserces insertion order)
    TreeSet (Stores the elements in sorted order and if null entry
            is available then it will throw runtime error)

SortedSet:
Stores the elements in sorted order.
