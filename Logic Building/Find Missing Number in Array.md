# Find the Missing Number in an Array

## Problem Description
Given an array containing `n` distinct numbers taken from the range `0` to `n`, find the one number that is missing from the array.

## Example
**Input:** [3, 0, 1]  
**Output:** 2  

**Input:** [9,6,4,2,3,5,7,0,1]  
**Output:** 8

## Constraints
- 1 <= nums.length <= 10⁴
- 0 <= nums[i] <= 10⁴
- All numbers in the array are unique

## Logic
Sum of first n natural numbers is: `n*(n+1)/2`  
So, total sum - actual sum of array = missing number

## My Approach
Calculate expected total sum and subtract actual sum of the array.

## Time and Space
- Time: O(n)
- Space: O(1)

## Code (Java)
```java
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
