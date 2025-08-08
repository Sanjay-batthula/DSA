### 🔄 Check Two Strings are Anagrams
This Java program checks whether two input strings are anagrams of each other using two efficient methods.

## 📌 Program Overview
Accepts two strings from the user.

Determines if they are anagrams (contain the same characters in any order).

Ignores case and whitespace.

## 🧠 Logic Used
✅ Method 1: Using char[] and Sorting
Convert both strings to lowercase and remove spaces.

Convert them to character arrays and sort them.

If both sorted arrays match, they’re anagrams.

## ✅ Method 2: Using HashMap<Character, Integer>
Count frequency of each character in both strings.

Compare both frequency maps.

If all character counts match, they’re anagrams.

## 💻 Full Code
```
package LogicBuildings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CheckAnagram {

    // Method 1: Sorting
    public static boolean isAnagramSort(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Method 2: HashMap
    public static boolean isAnagramMap(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("Anagram (Sort Method): " + isAnagramSort(str1, str2));
        System.out.println("Anagram (HashMap Method): " + isAnagramMap(str1, str2));
    }
}
```
## 📥 Sample Input
Enter first string: Listen  
Enter second string: Silent

## 📤 Sample Output
Anagram (Sort Method): true  
Anagram (HashMap Method): true

## 🎯 Benefits
Sharpens your understanding of string preprocessing, frequency mapping, and sorting.

Builds foundation for string-based interview problems.

Great for Java beginners learning HashMap and Arrays.