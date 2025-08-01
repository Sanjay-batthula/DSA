# 🧠 Selection Sort in Java

---

## 📌 Problem Description

Given an array of integers, sort the array in ascending order using the Selection Sort algorithm.

---

## 🧾 Example

**Input:**
Size: 5
Elements: 1 5 4 6 2

**Output:**
1 2 4 5 6


---

## 📏 Constraints

- 1 ≤ n ≤ 10⁵  
- -10⁹ ≤ arr[i] ≤ 10⁹  
- Input array may contain duplicates  
- Sorting should be done in-place

---

## 🔍 Logic

Selection sort works by repeatedly finding the minimum element from the unsorted portion of the array and putting it at the beginning.

Steps:
1. Start with the first element as the minimum.
2. Compare this minimum with the rest of the elements.
3. If you find a smaller element, update the minimum.
4. Swap the minimum with the first element.
5. Repeat the above steps for the rest of the array.

---

## 💡 My Approach

- Used two loops:
  - Outer loop selects each position from 0 to n-2.
  - Inner loop finds the minimum in the remaining unsorted array.
  - Swapped the smallest element found with the current index.
- Wrote a `selectionSort()` function for logic and `display()` for output.

---

## ⏱️ Time and Space Complexity

- **Time Complexity:** O(n²)  
- **Space Complexity:** O(1) — in-place sorting, no extra space used

---

## 🧑‍💻 Code (Java)

```java
package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        display(arr);
    }
}
```
