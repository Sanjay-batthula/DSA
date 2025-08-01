### 🔢 One Odd Occurring – Basic
## 🧾 Problem Statement
You're given an array arr[] of positive integers where:

Every element appears an even number of times

Except one number, which appears an odd number of times

👉 Your task: Return the number that occurs odd number of times.

## 📥 Input
arr[]: An array of integers

Constraints:

1 ≤ arr.length ≤ 10^5

1 ≤ arr[i] ≤ 10^6

## 📤 Output
Return the integer that occurs an odd number of times

## ✨ Examples
Input
arr = [1, 2, 3, 2, 3, 1, 3]
Output
3
Input
arr = [5, 7, 2, 7, 5, 2, 5]
Output
5

## 💡 Logic
Use XOR to cancel out even occurrences:

XOR of a number with itself is 0 → a ^ a = 0

XOR of 0 with a number is the number itself → 0 ^ a = a

So after XOR-ing all values, only the one with odd count remains.

## 🔍 My Approach
Initialize result = 0

Loop through array:

result ^= arr[i]

Return result

## 🧑‍💻 Java Code
```java
class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
```

## ⏱️ Time and Space Complexity
Time Complexity: O(n)

Space Complexity: O(1)

## ✅ Tip:
This is a classic XOR trick — asked often in interviews (Amazon, Snapdeal, etc.). Way better than using HashMap or sorting.