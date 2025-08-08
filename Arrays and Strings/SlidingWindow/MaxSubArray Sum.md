### Maximum Sum of Subarray of Size k
## 🧩 Problem Description
Given an array of integers and an integer k, find the maximum sum of any contiguous subarray of size k.

## 📘 Examples

Example 1
Input: arr = [4,2,1,8,10,40,2,3,30,9], k = 4
Output: 75
Explanation: The subarray [10,40,2,3] has the maximum sum of 75.

## 🔒 Constraints

1 ≤ k ≤ arr.length

Array may contain positive integers only

## ✅ Approach 1: Brute Force

We calculate the sum of every subarray of size k using nested loops and track the maximum.
Time Complexity: O(n*k)
Space Complexity: O(1)

```
import java.util.Scanner;

public class MaxSubSum {
    public static int maxSSubArray(int arr[], int k) {
        if (arr.length < k) {
            System.out.println("Not possible");
            return -1;
        }
        int maxSum = 0;
        int currentSum;
        for (int i = 0; i < arr.length - k + 1; i++) {
            currentSum = 0;
            for (int j = i; j < k + i; j++) {
                currentSum += arr[j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 8, 10, 40, 2, 3, 30, 9};
        int k = 4;
        System.out.println(maxSSubArray(arr, k));
    }
}
```
## ✅ Approach 2: Sliding Window

We optimize the brute force by calculating the sum of the first k elements, then slide the window by removing the first element and adding the next one in each step.
Time Complexity: O(n)
Space Complexity: O(1)

java
```
import java.util.Scanner;

public class MaxSubSum {
    public static int maxSubArray(int arr[], int k) {
        if (arr.length < k) {
            System.out.println("Not possible");
            return -1;
        }
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        int maxSum = currentSum;
        for (int j = k; j < arr.length; j++) {
            currentSum += arr[j] - arr[j - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 8, 10, 40, 2, 3, 30, 9};
        int k = 4;
        System.out.println(maxSubArray(arr, k));
    }
}
```