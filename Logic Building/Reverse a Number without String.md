# 🔁 Reverse a Number Without String – Easy

## 🧾 Problem Statement

Given an integer `n`, reverse its digits **without using any string operations**.

---

## 📥 Input

- A single integer `n`

---

## 📤 Output

- An integer representing the reversed digits of `n`

---

## 🧪 Examples

### Input
1234


### Output
4321


### Input
9050


### Output
509


---

## 💡 Logic

- Take the last digit using `n % 10`
- Add it to a result after multiplying current result by `10`
- Remove the last digit using `n / 10`
- Repeat till `n` becomes `0`

---

## 🧠 My Approach

1. Initialize `rev = 0`
2. While `n > 0`:
   - `digit = n % 10`
   - `rev = rev * 10 + digit`
   - `n = n / 10`
3. Output `rev`

---

## ⏱️ Time and Space Complexity

- **Time Complexity:** O(d), where d is the number of digits
- **Space Complexity:** O(1)

---

## 👨‍💻 Java Code

```java
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        System.out.println(rev);
    }
}

⚠️ Edge Case
If input is 1000, output should be 1, not 0001

Works only for positive integers; add sign handling if needed for negatives
