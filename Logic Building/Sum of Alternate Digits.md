### 🔢 Sum of Alternate Digits in a Number
❓ Question
Given a number, find the sum of digits at alternate positions, starting from the last digit.

## 🧩 Problem Description
You're given a positive integer n. Starting from the unit's digit, sum every alternate digit. This helps in pattern or checksum-related problems.

## 📌 Examples

Input: 123456  
Output: 12  
Explanation: Alternate digits (from right): 6 + 4 + 2 = 12

Input: 98765  
Output: 17  
Explanation: 5 + 7 + 5 = 17
## 🧠 Logic
We extract digits one by one from the right using % 10 and / 10. We use a boolean flag to track alternates and add only when the flag is true.

## ⚙️ My Approach
Loop through the number while it’s not 0. If it’s an alternate index (even position from the right), add the digit to the sum.

🧑‍💻 Code (Java)
```java
public class SumOfAlternateDigits {
    public static int sumAlternateDigits(int n) {
        int sum = 0;
        boolean add = true;
        while (n > 0) {
            int digit = n % 10;
            if (add) sum += digit;
            add = !add;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 123456;
        System.out.println(sumAlternateDigits(number));
    }
}


## ⏱️ Time and Space Complexity
Time: O(log₁₀(n)) — we process each digit once
Space: O(1)

## 📝 Note
Useful for parity-based checksum algorithms or pattern validation logic.