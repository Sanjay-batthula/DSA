
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