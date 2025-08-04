# MaxMinArray

This Java program takes an array as input and finds the **minimum** and **maximum** element from it.

---

## 📌 Program Overview

- Accepts an integer array from the user.
- Iterates through the array to determine:
  - The **maximum** element.
  - The **minimum** element.
- Prints both values.

---

## 🧠 Logic Used

- Initialize `min` and `max` as the first element of the array.
- Traverse the array using an enhanced `for` loop.
- Update `min` and `max` by comparing each element.

---

## 📦 Full Code

```java
package LogicBuildings;

import java.util.Scanner;

public class MaxMinArray {
    public void find_Min_Max(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min Element - " + min);
        System.out.println("Max Element - " + max);
    }

    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        arr = new int[sc.nextInt()];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        new MaxMinArray().find_Min_Max(arr);
    }
}
```

## 📥 Sample Input
Enter the size of the array  
5  
Enter the elements of the array  
3 7 1 9 2
## 📤 Sample Output
Min Element - 1  
Max Element - 9