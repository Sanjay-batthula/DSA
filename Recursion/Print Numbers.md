# Print Numbers Recursively (Without Loops)

## 🧩 Problem Title
Print numbers from 1 to N and from N to 1 using recursion (no loops allowed)

---

## 📜 Problem Description

You're given a number `N`. You need to print:

- All numbers from **1 to N** (ascending order)
- All numbers from **N to 1** (descending order)

🚫 **Condition:** You **cannot** use loops (`for`, `while`, etc). Only recursion should be used to solve the problem.

---

## 🧪 Example

### Input:
Enter the number: 5

### Output:
Printing 1 to 5:
1
2
3
4
5

Printing 5 to 1:
5
4
3
2
1


---

## 🔐 Constraints

- 1 ≤ N ≤ 10⁴
- No loops to be used
- Only recursion allowed

---

## 🧠 Logic

- To print from 1 to N:
  - Use recursion and call the function for `n-1` first.
  - Then print `n` after the recursive call (i.e., print after the stack unwinds).
- To print from N to 1:
  - Print `n` first.
  - Then call the function for `n-1`.

This way, the recursion stack handles the control flow instead of a loop.

---

## 🚀 My Approach

### For ascending (1 to N):
We recursively call `printAscending(n - 1)` until `n == 1`, and then start printing on the way back (unwinding phase of recursion).

### For descending (N to 1):
We print first and then call recursively `printDescending(n - 1)`. This prints on the way down (call phase of recursion).

---

## ⏱️ Time and Space Complexity

- **Time Complexity:** O(N)
- **Space Complexity:** O(N) → due to the recursive call stack (one for each number)

---

## 💻 Code (Java)

```java
package Recursion;
import java.util.Scanner;

public class PrintNumbersRecursively {

    // Print from 1 to n using recursion
    public static void printAscending(int n) {
        if (n > 1) {
            printAscending(n - 1);
        }
        System.out.println(n);
    }

    // Print from n to 1 using recursion
    public static void printDescending(int n) {
        System.out.println(n);
        if (n > 1) {
            printDescending(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Printing 1 to " + n + ":");
        printAscending(n);

        System.out.println("Printing " + n + " to 1:");
        printDescending(n);
    }
}
