# 🧠 Quick Sort in Java

## 🧾 Problem Description

Given an array of `n` integers, sort the array in **ascending order** using the **Quick Sort algorithm** without using built-in sorting functions.

Quick Sort is a **Divide and Conquer** algorithm. It picks an element as a pivot and partitions the array around the pivot.

---

## 📥 Input

- An integer `n` representing the size of the array.
- `n` space-separated integers.

---

## 📤 Output

- The array sorted in ascending order.

---

## ✨ Example

### Input
# 🧠 Quick Sort in Java

## 🧾 Problem Description

Given an array of `n` integers, sort the array in **ascending order** using the **Quick Sort algorithm** without using built-in sorting functions.

Quick Sort is a **Divide and Conquer** algorithm. It picks an element as a pivot and partitions the array around the pivot.

---

## 📥 Input

- An integer `n` representing the size of the array.
- `n` space-separated integers.

---

## 📤 Output

- The array sorted in ascending order.

---

## ✨ Example

### Input
5
8 3 1 7 2


### Output
1 2 3 7 8

---

## 📌 Constraints

- `1 <= n <= 10^5`
- `-10^6 <= arr[i] <= 10^6`

---

## ⚙️ Logic Behind Quick Sort

1. Choose a **pivot** (we're picking the first element here).
2. Partition the array such that:
   - Elements smaller than the pivot go to the left.
   - Elements greater than the pivot go to the right.
3. Recursively apply the same steps to the sub-arrays.

This approach avoids extra memory usage (in-place sort) and performs better on average.

---

## 🔍 My Approach

- Implemented `quickSort()` using recursion.
- Created a helper `partition()` function to divide the array.
- Used the **first element** as the pivot.
- Used two pointers to swap elements based on pivot comparison.
- Recursively sorted the left and right partitions.

---

## ⏱️ Time and Space Complexity

- **Best / Average Case:** `O(n log n)`
- **Worst Case (already sorted array):** `O(n^2)`
- **Space Complexity:** `O(log n)` (for recursion stack)

---

## 🧑‍💻 Code (Java)

```java
package Sorting;

import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) i++;
            while (j > low && arr[j] > pivot) j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        display(arr);
    }
}
```


## 📌 Note: You can change the pivot selection to middle or last element depending on the case to avoid worst-case scenarios.