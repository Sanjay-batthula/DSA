# Second Largest in Array - Java Program

## 📄 Program Description
This program takes an array of integers as input and finds the second largest unique element in the array.

---

## 📦 Package Declaration
```java
package LogicBuildings;

import java.util.Scanner;

public class SecondLargestInArray {
    public static int findSecondLargestInArray(int[] arr) {
        int max = arr[0];
        int sMax = 0;
        for(int num: arr){
            if(max < num){
                sMax = max;
                max = num;
            }else if(sMax < num && num != max){
                sMax = num;
            }
        }
        return sMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSecondLargestInArray(arr));
    }
}

## 🧪 Sample Input/Output
Enter the size of the array: 
5
Enter the elements of the array: 
-3  5 -5 2 1
2


## ⚠️ Note
Make sure the array contains at least two distinct elements, otherwise second largest might not be valid or meaningful.

## 🛠️ Fix Suggestion for Edge Cases
Instead of initializing sMax to 0, use Integer.MIN_VALUE to handle negative numbers correctly.

```java
int max = Integer.MIN_VALUE;
int sMax = Integer.MIN_VALUE;


## 🧠 Why Use This Approach?
One-pass O(n) solution.
No sorting needed.
Efficient and scalable.

