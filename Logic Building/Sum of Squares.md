# Sum of Squares

🧩 **Problem Description**  
Given a positive integer `n`, find the sum of squares of the first `n` natural numbers.  

The sum of squares of the first `n` natural numbers is:  
`1² + 2² + 3² + ... + n²`

---

📘 **Examples**

**Example 1**  
Input: `n = 3`  
Output: `14`  
Explanation: `1² + 2² + 3² = 1 + 4 + 9 = 14`

**Example 2**  
Input: `n = 5`  
Output: `55`  
Explanation: `1² + 2² + 3² + 4² + 5² = 1 + 4 + 9 + 16 + 25 = 55`

---

🔒 **Constraints**  
- `1 ≤ n ≤ 10⁶`

---

✅ **Approach**  
We use the mathematical formula for the sum of squares:  
`sum = (n * (n + 1) * (2n + 1)) / 6`  

This gives us a time complexity of `O(1)` and auxiliary space complexity of `O(1)`.

---

🧑‍💻 **Code (Java)**  
```java
import java.util.Scanner;

public class Main {
    public static int sumOfSquares(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfSquares(n));
    }
}
