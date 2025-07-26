# Countwords

## Problem Statement

Write a program that counts the number of words in a given input string.

---

## Input

A single line containing a sentence (string of words separated by spaces).

### Example

**Input:**
asdf asdf asdf 

**Output:**
3


---

## Explanation

In the given input, there are 5 words:  
`Hello`, `world`, `this`, `is`, `Java`.

The program uses the `split("\\s+")` method to break the input string by one or more whitespace characters and counts the resulting words.

---

## Java Code

```java

import java.util.Scanner;

public class Countwords {
    public static int countwords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(countwords(input));
    }
}
