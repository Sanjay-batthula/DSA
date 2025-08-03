# 🔍 Find First Non-Repeated Character – Medium

This Java program finds the **first non-repeated character** in a given string using two approaches — one with `String`, and one with `StringBuilder`.

---

## 📌 Program Overview

- Accepts a string from the user.
- Checks each character for uniqueness.
- Returns the first character that is not repeated in the string.

---

## 🧠 Logic Used

### ✅ Using `String`
- For each character, check if its `indexOf` and `lastIndexOf` are the same.
- If yes, that character is the first non-repeated one.

### ✅ Using `StringBuilder`
- Convert string to `StringBuilder`.
- Same logic applies using `indexOf()` and `lastIndexOf()` on the builder.

---

## 💻 Full Code

```java
import java.util.Scanner;

public class FirstNonRepeatedChar {

    public static void findWithString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeated character (String): " + ch);
                return;
            }
        }
        System.out.println("No unique character found (String).");
    }

    public static void findWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (sb.indexOf(String.valueOf(ch)) == sb.lastIndexOf(String.valueOf(ch))) {
                System.out.println("First non-repeated character (StringBuilder): " + ch);
                return;
            }
        }
        System.out.println("No unique character found (StringBuilder).");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String input = sc.nextLine();

        findWithString(input);
        findWithStringBuilder(input);
    }
}
```


## 📥 Sample Input
Enter any String: aabbcdeff

## 📤 Sample Output
First non-repeated character (String): c  
First non-repeated character (StringBuilder): c


## 🎯 Why It's Useful
Sharpens your string handling skills.

Shows how indexOf and lastIndexOf can simplify logic.

Interview-friendly question asked in companies like Amazon, Microsoft, etc.