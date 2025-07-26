# LCM and GCD

🧩 **Problem Description**  
Given two positive integers `a` and `b`, calculate their **Greatest Common Divisor (GCD)** and **Least Common Multiple (LCM)**.

The GCD of two numbers is the largest number that divides both of them without leaving a remainder.  
The LCM of two numbers is the smallest number that is a multiple of both.

---

📘 **Examples**

**Example 1**  
Input: `a = 4, b = 6`  
Output:  
GCD: `2`  
LCM: `12`

**Example 2**  
Input: `a = 21, b = 14`  
Output:  
GCD: `7`  
LCM: `42`

---

🔒 **Constraints**  
- `1 ≤ a, b ≤ 10⁶`

---

✅ **Approach**  
- To calculate GCD, use the Euclidean algorithm:
  - While `b ≠ 0`, do:  
    `temp = b`,  
    `b = a % b`,  
    `a = temp`  
  - Return `a` as the GCD.
- Then calculate LCM using:  
  `LCM = (a * b) / GCD`

Time Complexity: `O(log(min(a, b)))`  
Space Complexity: `O(1)`

---

🧑‍💻 **Code (Java)**  
```java
import java.util.Scanner;

public class LCM_GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcdVal = gcd(a, b);
        int lcmVal = lcm(a, b);

        System.out.println("GCD: " + gcdVal);
        System.out.println("LCM: " + lcmVal);
    }
}
