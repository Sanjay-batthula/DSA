### ✅ Check If a Sentence is a Pangram
This Java program checks whether a given sentence is a pangram — a sentence that contains every letter of the English alphabet at least once.

## 📌 Program Overview
Accepts a sentence from the user.

Converts it to lowercase to handle case-insensitive checks.

Checks whether all 26 letters (a-z) are present.

## 🧠 Logic Used
✅ Method: Using boolean[] Array
Create a boolean[26] array to represent all lowercase letters.

Traverse each character in the input string.

If it's a letter (between 'a' to 'z'), mark it as found.

Finally, check if all 26 positions in the array are marked as true.

## 💻 Full Code
```
package LogicBuildings;

import java.util.Scanner;

public class CheckPangram {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (boolean b : alphabet) {
            if (!b) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        if (isPangram(input)) {
            System.out.println("✅ It's a Pangram.");
        } else {
            System.out.println("❌ Not a Pangram.");
        }
    }
}
```

## 📥 Sample Input
The brown fox quickly jumps on lazy dog.

## 📤 Sample Output
✅ It's a Pangram.

## 🎯 Benefits
Great practice for character mapping and array usage.

Reinforces how to handle strings and ASCII character manipulation in Java.

Useful in coding rounds that test string validation and logic skills.