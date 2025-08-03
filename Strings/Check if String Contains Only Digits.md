# String Digit Checker

This Java program checks whether a given string contains only digits. If any non-digit characters are found, it prints the first non-digit character detected.

---

## Examples

**Input:**
`123456`
**Output:**
Contains digits

**Input:**
**Output:**
Contains non digits - a


---

## Overview

This program reads a string from the user, iterates over each character, and checks whether it is a digit using `Character.isDigit(char)`. If all characters are digits, it prints a success message. If it finds a non-digit, it prints an error with the specific character.

---

## Code

```java
package LogicBuildings;

import java.util.Scanner;

public class StringDigit {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        boolean flag = true;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                flag = false;
                System.out.println("Contains non digits - " + c);
                break;
            }
        }
        if (flag) {
            System.out.println("Contains digits");
        }
    }
}
```

---

## How It Works

* Takes input from user using `Scanner`
* Iterates through the string using enhanced for-loop
* Uses `Character.isDigit()` to verify if the character is a digit
* If a non-digit is found, breaks the loop and prints which character caused the failure

---

## Input & Output

```bash
Input: 23456
Output: Contains digits

Input: 89k32
Output: Contains non digits - k
```

---

> ✅ Tip: This logic is useful in form validation or checking numeric IDs, zip codes, or OTPs.
