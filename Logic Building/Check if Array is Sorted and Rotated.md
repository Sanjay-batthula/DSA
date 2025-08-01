
# Check if Array is Sorted and Rotated

## Problem Description
Check whether the given array is sorted in increasing order and then rotated.

## Example
**Input:** [3, 4, 5, 1, 2]  
**Output:** true  

**Input:** [1, 2, 3, 4, 5]  
**Output:** true  

**Input:** [2, 1, 3, 4]  
**Output:** false

## Constraints
- 1 ≤ N ≤ 10⁵

## Logic
Count the number of times an element is greater than its next.  
If it’s more than 1, it’s not sorted & rotated.

## My Approach
Loop and count "drops" in order.

## Time and Space
- Time: O(n)
- Space: O(1)

## Code (Java)
```java
public class SortedRotatedCheck {
    public static boolean checkSortedAndRotated(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}
```
