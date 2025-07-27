# ➕ Sum of Digits in a Number – Easy

## 🧾 Problem Statement

Given an integer `n`, find the sum of its digits.

---

## 📥 Input

- A single integer `n`

---

## 📤 Output

- An integer representing the sum of digits in `n`

---

## 📌 Examples

### Input
1234


### Output
10


---

## 💡 Logic

- Repeatedly get the last digit using `% 10`
- Add it to sum
- Remove the last digit using `/ 10`
- Repeat until `n` becomes `0`

---

## 🧠 My Approach

- Initialize `sum = 0`
- While `n > 0`:
  - `digit = n % 10`
  - `sum += digit`
  - `n = n / 10`
- Print `sum`

---

## ⏱️ Time and Space Complexity

- **Time Complexity:** O(d), where d is the number of digits
- **Space Complexity:** O(1)

---

## 👨‍💻 Java Code

```java
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        System.out.println(sum);
    }
}
