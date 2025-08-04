# 🚀 Sort Array Without Inbuilt Methods – Medium

## 🧾 Problem Statement

Given an unsorted array of integers, **sort the array in ascending order** without using any inbuilt sort methods (like `Arrays.sort()` or `Collections.sort()`).

Your task is to implement a sorting algorithm manually to sort the elements.

---

## 📥 Input

- First line: An integer `n` (size of the array)
- Second line: `n` space-separated integers (the array elements)

---

## 📤 Output

- The sorted array in ascending order as space-separated integers

---

## ✨ Example

### Input
5
4 2 1 3 5


### Output
1 2 3 4 5


---

## 📌 Constraints

- `1 <= n <= 1000`  
- `-10^5 <= arr[i] <= 10^5`

---

## 💡 Logic

- We'll use **Selection Sort** (or you can go with **Bubble Sort** or **Insertion Sort**).
- Compare each element with the rest, and swap with the smallest.
- Simple to implement, no extra space needed.

---

## 🔍 My Approach

1. Read `n` and array elements.
2. Loop through the array from index `0` to `n-1`.
3. For each index, find the minimum element in the remaining array.
4. Swap the current index with the minimum.
5. Print the sorted array.

---

## 🧑‍💻 Java Code

```java
import java.util.Scanner;

public class SortWithoutInbuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```


## ⏱️ Time and Space Complexity
Time Complexity: O(n²)

Space Complexity: O(1) – No extra space used apart from variables

## ⚠️ Note
Avoid using built-in methods like sort() in coding rounds unless allowed.

If time permits, try optimizing with a faster algorithm like Merge Sort or Quick Sort (but more complex to implement).

