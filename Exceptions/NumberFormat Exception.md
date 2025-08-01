### 🔢 Number Format Exception – Java

## 🧾 Problem Statement  
You're trying to convert a string to an integer using `Integer.parseInt()`.  
But what if the string isn't a valid number? 😬  
Boom — `NumberFormatException` is thrown.

## 📥 Input  
A string that is **not** a valid number:  
`"abc"`

## 📤 Output  
- Prints the exception info  
- Executes the `finally` block to show cleanup is done

## 💡 Logic  
- `Integer.parseInt("abc")` throws a `NumberFormatException` because `"abc"` can't be converted into a number.  
- The `catch` block handles the exception gracefully.  
- The `finally` block runs no matter what — perfect for cleanup ops or closing resources.

## 🔍 My Approach  
1. Declare a string with invalid numeric content  
2. Try to convert it using `Integer.parseInt()`  
3. Catch the exception  
4. Use a `finally` block to print a message after the try-catch finishes

## 🧑‍💻 Java Code
```java
package Exception;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("Clean up done");
        }
    }
}
```

## ⏱️ Time and Space Complexity
Time Complexity: O(1) — only doing a single parse operation
Space Complexity: O(1) — no extra memory used

## ✅ Tip
✅ Always validate your input before parsing it. Use regex or try-catch depending on the use case.
🚫 Integer.parseInt() will crash if the string isn't a proper number — always be ready to catch!

