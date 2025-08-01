### 📊 Count of Smaller Elements – Basic
## 🧾 Problem Statement
Given an unsorted array arr[] and an integer x, find the count of elements less than or equal to x.

## 📥 Input
A list of integers arr[]

An integer x

## 📤 Output
Print the count of elements in arr[] which are less than or equal to x.

## ✨ Example
Input
x = 9  
arr = [10, 1, 2, 8, 4, 5]
Output
5
Explanation
The numbers ≤ 9 are: 1, 2, 8, 4, 5 → Total: 5

## 💡 Logic
We need to traverse through the entire array.

For each element, check if it's ≤ x.

If yes, increment a counter.

Finally, return that count.

## 🔍 My Approach
Read x and the array arr[].

Initialize a counter to 0.

Loop through the array.

For every element e, if e <= x, increment the counter.

Print the final count.

## 🧑‍💻 Java Code
```java
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            if (num <= x) count++;
        }
        return count;
    }
}
```

## ⏱️ Time and Space Complexity
Time Complexity: O(n)

Space Complexity: O(1)

## ✅ Tip:
This is a solid warm-up question. Always remember to go linear scan when the array is unsorted and there's no need to sort or use extra data structures 🚀