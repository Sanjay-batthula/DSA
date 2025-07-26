
# Palindrome Checker

🧩 **Problem Description**  
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward.  
Your task is to determine if a given string is a palindrome.

---

📘 **Examples**

**Example 1**  
Input: `madam`  
Output: `It is a palindrome`

**Example 2**  
Input: `hello`  
Output: `It is not a palindrome`

---

🔒 **Constraints**  
- Input will be a string of length `1 ≤ n ≤ 10⁵`  
- The string will consist of lowercase or uppercase alphabets (no spaces or special characters)

---

✅ **Approach**  
We use two pointers:  
- One starts from the beginning of the string  
- The other starts from the end  
We compare characters at both pointers. If they differ, it's not a palindrome.  
Time complexity: `O(n)`  
Space complexity: `O(1)`

---

🧑‍💻 **Code (Java)**  
```java
package LogicBuildings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int flag = 1;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
```
