# Insertion Sort

## Problem Description  
Sort an array of integers in ascending order using the Insertion Sort algorithm.

## Example  
**Input:**  
Size: 5  
Elements: 5 3 1 4 2  

**Output:**  
1 2 3 4 5

## Constraints  
- 1 ≤ N ≤ 10⁵  
- -10⁴ ≤ A[i] ≤ 10⁴  

## Logic  
Insertion Sort works by dividing the array into a sorted and unsorted part. It iteratively takes each element from the unsorted part and places it at the correct position in the sorted part by shifting larger elements to the right.

## My Approach  
I used a simple loop where I pick the `key` (current element) and move all greater elements to one position ahead to make space for the `key`.

## Time and Space Complexity  
- **Time Complexity:** O(n²) in the worst case, O(n) in the best case  
- **Space Complexity:** O(1) — it’s an in-place sort  

## Code (Java)
```java
package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertSort(int[] arr) {
        int key;
        for(int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j;
            for(j = i-1 ; j >= 0 && key < arr[j]; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
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
        insertSort(arr);
        display(arr);
    }
}
```
