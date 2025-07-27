# 🔍 Check Prime Number – Easy

## 🧾 Problem Statement

Given an integer `n`, check whether it is a **prime number** or not.

A number is prime if it has only two divisors: `1` and itself.

---

## 📥 Input

- A single integer `n` (where `n >= 2`)

---

## 📤 Output

- Print `"Prime"` if the number is prime.
- Print `"Not Prime"` otherwise.

---

## ✨ Example

### Input
7


### Output
Prime


---

## 💡 Logic

To check if a number `n` is prime:
- A number is **not prime** if it is divisible by any number between `2` and `√n`.
- So we loop from `2` to `sqrt(n)` and check `n % i == 0`.

---

## 🔍 My Approach

1. Read input number `n`.
2. Handle edge cases (like 0 and 1 if included).
3. Loop from `2` to `√n` and check divisibility.
4. If divisible → not prime. Else → prime.

---

## 🧑‍💻 Java Code

```java
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}


## ⏱️ Time and Space Complexity
Time Complexity: O(√n)
Space Complexity: O(1)

## ✅ Tip: 
This question is a classic in coding rounds — be efficient by avoiding O(n) brute force and go with √n optimization 💯