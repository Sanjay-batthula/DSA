# 💪 Armstrong Number – Medium

## 🧾 Problem Statement

An **Armstrong number** (also known as a narcissistic number) is a number that is equal to the **sum of its own digits each raised to the power of the number of digits**.

### Example:
- `153` is an Armstrong number because:  
  `1³ + 5³ + 3³ = 1 + 125 + 27 = 153`
- `9474` is also an Armstrong number:  
  `9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = 9474`

---

## 📥 Input
- A single integer `n`

---

## 📤 Output

- Print `"Armstrong Number"` if true  
- Else, print `"Not an Armstrong Number"`

---

## ✨ Examples

### Input
153


### Output
Armstrong Number


---

## 📌 Constraints

- `1 <= n <= 100000`

---

## 💡 Logic

1. Count the number of digits `d` in the number.
2. For each digit in `n`, raise it to the power `d` and sum it.
3. If the final sum equals the original number → Armstrong!

---

## 🧠 Approach

- Use `String.valueOf(n).length()` to count digits.
- Loop through digits using `%10` and `/10`.
- Use `Math.pow(digit, numberOfDigits)` to get powered value.

---

## 🧑‍💻 Java Code

```java
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}


## ⏱️ Time and Space Complexity
Time Complexity: O(d) → d = number of digits in n

Space Complexity: O(1)

##📎 Notes
Any single-digit number is trivially an Armstrong number.

Works for 3-digit and 4-digit inputs too.

You can also use recursion but it's not memory efficient here.



