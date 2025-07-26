# 🔄 Reverse a String in Java

This program demonstrates how to reverse a string using **two methods** in Java.

---

## 📌 Problem Statement

Given a string, reverse its characters and return the reversed version.

---

## 📥 Sample Input
hello


## 📤 Expected Output
olleh
olleh


---

## 🧠 Approach

### ✅ Method 1: Using `StringBuilder.reverse()`

- Convert the input string to a `StringBuilder`.
- Use the `.reverse()` method.
- Return the reversed string.

### ✅ Method 2: Manual Character Swapping

- Convert the string to a character array.
- Use two-pointer technique to swap characters from both ends until the middle.

---

## 👨‍💻 Java Code

```java
import java.util.Scanner;

public class ReverseString {
    public static String method1_stringbuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String method2_manual(String str) {
        //  String reverse = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        //    reverse += s.charAt(i);
        // }
        // System.out.println(reverse);
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println(method1_stringbuilder(input));
        System.out.println(method2_manual(input));
    }
}


## 🧪 Test Cases
Input	Output
hello	olleh
java	avaj
racecar	racecar


## ⏱️ Time and Space Complexity
| Method           | Time Complexity | Space Complexity |
| ---------------- | --------------- | ---------------- |
| 1. StringBuilder | O(n)            | O(n)             |
| 2. Manual Swap   | O(n)            | O(n)             |

##🙌 Conclusion
Reversing a string can be done efficiently with built-in methods or manually for deeper understanding.




