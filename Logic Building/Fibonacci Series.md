# 🌀 Fibonacci Series – Easy

## 🧾 Problem Statement

Given a number `n`, print the **first `n` terms** of the Fibonacci sequence.

The Fibonacci sequence is defined as:
F(0) = 0
F(1) = 1
F(n) = F(n - 1) + F(n - 2) for n > 1


---

## 📥 Input

- A single integer `n` (number of terms to print)

---

## 📤 Output

- `n` space-separated integers from the Fibonacci sequence

---

## ✨ Example

### Input
5


### Output
0 1 1 2 3


---

## 📌 Constraints

- `1 <= n <= 50`

---

## 💡 Logic

- The first two terms are always `0` and `1`.
- Every next term is the sum of the previous two.
- Loop and generate terms using a temporary variable.

---

## 🔍 My Approach

1. Read integer `n`.
2. Initialize `a = 0`, `b = 1`.
3. Print first two terms.
4. Loop from `3` to `n`, calculate `c = a + b`, update `a = b`, `b = c`.

---

## 🧑‍💻 Java Code

```java
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}


## ⏱️ Time and Space Complexity
Time Complexity: O(n)

Space Complexity: O(1) (we're using constant variables only)

⚠️ Note: If you’re asked to find just the nth Fibonacci number, you can also use recursion or dynamic programming, but for printing series, loop is the most efficient way.

