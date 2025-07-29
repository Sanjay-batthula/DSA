### 🔁 Toggle Case of a String
## ❓ Question
Write a program to toggle each character in a string — uppercase to lowercase and vice versa.

## 🧩 Problem Description
Given a string, convert each lowercase character to uppercase and each uppercase to lowercase manually (without using .toLowerCase() or .toUpperCase()).

## 📌 Examples
Input: SanJaY  
Output: sANjAy

Input: Hello123  
Output: hELLO123

## 🧠 Logic
Loop through each character, check if it’s in the uppercase or lowercase ASCII range, and manually convert using ASCII math.

## ⚙️ My Approach
Used character comparisons with ASCII values:

A to Z → 65 to 90

a to z → 97 to 122
Use:

char + 32 for upper to lower

char - 32 for lower to upper

🧑‍💻 Code (Java)
```java
public class ToggleCase {
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32));
            } else if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "SanJaY123";
        System.out.println(toggleCase(input));
    }
}
## ⏱️ Time and Space Complexity
Time: O(n) — one pass over the string
Space: O(n) — for storing the result

## 📝 Note
Don’t use .toLowerCase() or .toUpperCase() if the goal is to understand ASCII character logic deeply.

