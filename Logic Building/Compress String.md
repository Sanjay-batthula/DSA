# CompressString

## Problem Statement

Write a program that compresses a given string using run-length encoding.  
If a character repeats consecutively, replace the sequence with the character followed by the count of repetitions.

---

## Input

A single line string containing only characters (no spaces).

### Example

**Input:**
aaabbc

**Output:**
a3b2c1


---

## Explanation

- `"aaabbc"` contains:  
  - `'a'` repeated 3 times  
  - `'b'` repeated 2 times  
  - `'c'` repeated 1 time  
- So the compressed version is `"a3b2c1"`.

---

## Java Code

```java

import java.util.Scanner;

public class CompressString {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compress(s));
    }
}


