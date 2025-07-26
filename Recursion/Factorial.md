# Factorial using Recursion

## Problem Description  
Find the factorial of a given non-negative integer using recursion.

## Example  
**Input:**  
Enter the number: 5  

**Output:**  
The factorial of 5 is 120

## Constraints  
- 0 ≤ N ≤ 20  
- Factorial grows rapidly, so limit is set to prevent integer overflow.

## Logic  
The factorial of a number `n` is the product of all positive integers less than or equal to `n`.  
Mathematically:  
n! = n × (n - 1) × (n - 2) × ... × 1  
Using recursion, we define:  
- Base Case: `fact(0) = 1`  
- Recursive Case: `fact(n) = n * fact(n - 1)`

## My Approach  
I used a recursive function that keeps multiplying `n` with `fact(n-1)` until it reaches the base case (n = 1).

## Time and Space Complexity  
- **Time Complexity:** O(n)  
- **Space Complexity:** O(n) due to recursive call stack  

## Code (Java)
```java
package Recursion;
import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + fact(n));
    }
}
