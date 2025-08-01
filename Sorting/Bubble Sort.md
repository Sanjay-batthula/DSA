# Bubble Sort

## Problem Description
Given an array of integers, the task is to sort the array in ascending order using the **Bubble Sort** algorithm. Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

## Example

**Input:**
Enter the size of the array
5
Enter the elements of the array
64 34 25 12 22


**Output:**
12 22 25 34 64


## Constraints
- 1 ≤ n ≤ 10⁴  
- -10⁶ ≤ arr[i] ≤ 10⁶  

## Logic
Bubble Sort works by repeatedly swapping the adjacent elements if they are in the wrong order. The algorithm keeps running until the array is completely sorted. A flag is used to optimize the process by breaking early if no swaps occurred in an inner pass.

## My Approach
- Input the size and elements of the array.
- Use two loops: outer loop to control the number of passes, and inner loop to compare adjacent elements.
- Swap if the left element is greater than the right.
- Use a flag to break early if the array becomes sorted before completing all passes.
- Finally, display the sorted array.

## Time and Space Complexity
- **Time Complexity:** O(n²) in the worst and average case, O(n) in the best case when the array is already sorted.
- **Space Complexity:** O(1), as sorting is done in-place.

## Code (Java)
```java
package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }
    public static void display(int[] arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        display(arr);
    }
}
```


