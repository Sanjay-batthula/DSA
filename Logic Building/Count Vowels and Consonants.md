# 🧪 Java Program: Count Vowels and Consonants

This Java program takes an input string and counts the number of **vowels** and **consonants** in it.

---

## 📥 Input Format

User enters a string via standard input.

```txt
hello world

## 🧠 Logic Behind the Code
Loop through each character in the string.

If the character is a letter:

If it's a vowel (a, e, i, o, u), increment vowel count.

Else, it's a consonant → increment consonant count.

Ignore spaces, digits, and special characters.


🧑‍💻 **Code (Java)**  
```java
package LogicBuildings;

import java.util.Scanner;

public class vowelcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        int vc = 0, cc = 0;
        while (i < str.length()) {
            char ch = str.charAt(i++);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) == -1) {
                    cc++;
                } else {
                    vc++;
                }
            }
        }
        System.out.println(vc + " vowels " + cc + " consonants");
    }
}
```

## ✅ Sample Output
```txt
hello world
3 vowels 7 consonants
```

## 📌Note
This code is case-sensitive — only lowercase vowels (aeiou) are counted.

To handle both uppercase and lowercase, convert ch to lowercase using Character.toLowerCase(ch).