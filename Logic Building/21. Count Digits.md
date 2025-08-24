# 🔢 Count Digits in a Number – Easy

## 🧾 Problem Statement

Given an integer `n`, count the number of digits present in it.

---

## 📥 Input

- A single integer `n`

---

## 📤 Output

- An integer representing the count of digits

---

## 📌 Examples

### Input
12345


### Output
5


---

## 💡 Logic

- Convert number to a string and find its length  
**OR**  
- Use a loop:
  - Keep dividing `n` by 10 until it becomes 0
  - Increment counter for each division

---

## 🧠 Approach

### Method 1: Using string conversion
- `String.valueOf(n).length()` in Java  
- `len(str(n))` in Python

### Method 2: Using loop
- Run while loop: `n > 0`  
- Inside, do `n = n / 10`, increment `count`

---

## 🧑‍💻 Java Code

```java
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);
    }
}
```

## ⏱️ Time and Space Complexity
Time Complexity: O(d) where d is the number of digits

Space Complexity: O(1)

