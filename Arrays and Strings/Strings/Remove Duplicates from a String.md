# 🧹 Remove Duplicates from a String

This Java program removes duplicate characters from a given string using two different methods.

---

## 📌 Program Overview

- Accepts a string from the user.
- Removes all repeated characters.
- Returns a string with only unique characters, preserving the original order.

---

## 🧠 Logic Used

### ✅ Method 1: Using `HashSet` (Efficient & Beginner Friendly)
- Traverse the string character by character.
- Store each character in a `HashSet`.
- If it's not already in the set, append it to a new result string.

### ✅ Method 2: Using `String.indexOf()` (Simple Logic)
- For each character, check if it already appears before in the result.
- If not, append it.

---

## 💻 Full Code

```java
package LogicBuildings;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    // Method 1: Using HashSet
    public static void removeWithHashSet(String str) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        System.out.println("Without Duplicates (HashSet): " + result);
    }

    // Method 2: Using indexOf
    public static void removeWithIndexOf(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(str.charAt(i)) == -1) {
                result += str.charAt(i);
            }
        }
        System.out.println("Without Duplicates (indexOf): " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String input = sc.nextLine();

        removeWithHashSet(input);
        removeWithIndexOf(input);
    }
}
```


## 📥 Sample Input
Enter any String: programming
## 📤 Sample Output
Without Duplicates (HashSet): progamin
Without Duplicates (indexOf): progamin


## 🎯 Benefits
Helps understand sets, strings, and loops in Java.

Teaches two common techniques in DSA to handle string manipulation.
