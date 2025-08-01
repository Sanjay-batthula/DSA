# FirstNonRepeatingCharacter.java

This Java program finds the **first non-repeating character** from a given string using two different methods:
1. Using a `LinkedHashMap` to track character counts.
2. Using `indexOf` and `lastIndexOf` logic.

---

## ✅ Features

- **Method 1**: Preserves insertion order using `LinkedHashMap` and returns the first character with a frequency of 1.
- **Method 2**: Uses `indexOf` and `lastIndexOf` to detect the first unique character.

---

## 🧠 Logic

### Method 1 (HashMap):
- Traverse the string and count frequency of each character.
- Traverse again and return the first one with frequency = 1.

### Method 2 (Index Comparison):
- For each character, check if its first and last index are same.
- If so, it’s non-repeating.

---

## 📥 Input

```bash
Enter a string:
google

## 📥 Output
l
l

## 📥 Test Cases
| Input  | Output |
| ------ | ------ |
| google | l      |
| stress | t      |
| aabbcc | null   |



🧑‍💻 Code (Java)
```java
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static Character method1_hashmap(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static Character method2_index(String str) {
        for (char c : str.toCharArray()) {
            int fi = str.indexOf(c);
            int li = str.lastIndexOf(c);
            if (fi == li) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(method1_hashmap(s));
        System.out.println(method2_index(s));
    }
}
```


📝 **Time and Space Complexity**  
- Method 1: `O(n)` time 
- FMethod 2: `O(n^2)` time
- Space Complexity: O(n)

## 🧠 Note
LinkedHashMap is used instead of HashMap to maintain order.
Returns null if no unique character is found.