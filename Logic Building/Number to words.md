### 🔤 Number to Words (1 to 999)
## ❓ Question
Convert any number from 1 to 999 into its English word representation.

## 🧩 Problem Description
Given a number n (1 ≤ n ≤ 999), print its English words. Don't use libraries or NumberFormat classes.

## 📌 Examples
Input: 245  
Output: Two Hundred Forty Five

Input: 7  
Output: Seven

Input: 810  
Output: Eight Hundred Ten

## 🧠 Logic
Break down the number into hundreds, tens, and units. Use pre-defined word arrays for 1-19 and multiples of 10.

## ⚙️ My Approach
Used three arrays:

One for 1–19

One for tens multiples

Handled hundreds separately

## 🧑‍💻 Code (Java)
```java
public class NumberToWords {
    static final String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convert(int num) {
        if (num <= 0 || num > 999) return "Invalid";

        StringBuilder result = new StringBuilder();

        if (num >= 100) {
            result.append(ones[num / 100]).append(" Hundred ");
            num %= 100;
        }

        if (num < 20) {
            result.append(ones[num]);
        } else {
            result.append(tens[num / 10]).append(" ");
            result.append(ones[num % 10]);
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(convert(245));  // Two Hundred Forty Five
        System.out.println(convert(7));    // Seven
        System.out.println(convert(810));  // Eight Hundred Ten
    }
}

## ⏱️ Time and Space Complexity
Time: O(1) — Fixed operations for number ≤ 999

Space: O(1)

## 📝 Note
You can expand this logic further to include thousands and lakhs easily by adding more word chunks.