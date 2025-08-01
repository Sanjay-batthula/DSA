
 **Find First Repeating Element** – *Medium*

## Problem Description
Find the first element that repeats in an array of integers.

## Example
**Input:** [1, 5, 3, 4, 3, 5, 6]  
**Output:** 5

## Constraints
- 1 ≤ N ≤ 10⁵

## Logic
Use a HashSet to track visited elements. The first one you see again is your answer.

## My Approach
As you iterate, if the number exists in the set → it's repeating.

## Time and Space
- Time: O(n)
- Space: O(n)

## Code (Java)
```java
import java.util.HashSet;

public class FirstRepeating {
    public static int findFirstRepeating(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1; // No repeating element
    }
}
```
