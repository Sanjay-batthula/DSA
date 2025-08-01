### 🧨 Null Pointer Exception – Handling Null References

## 🧾 Problem Statement  
You're trying to access a method on a reference that is `null`.  
In Java, this leads to the classic `NullPointerException`.

Your task: Simulate this scenario and handle it properly using `try-catch-finally`.

## 📥 Input  
A reference that is explicitly set to `null`.

## 📤 Output  
- Catch and print a user-friendly error message if a `NullPointerException` occurs  
- Always print a cleanup/final message using `finally`

## ✨ Example  
**Code attempts:**  
Accessing `str.length()` where `str = null`

**Expected Output:**  
Error: Null Reference
clean up done


## 💡 Logic  
Calling a method on a `null` object reference in Java throws a `NullPointerException`.  
It's one of the most common runtime errors.

The fix? Use `try-catch` to gracefully handle the failure and keep your program from crashing.

`finally` runs always — good for resource cleanup or logging.

## 🔍 My Approach  
- Set a String variable to `null`  
- Try calling `.length()`  
- Catch the `NullPointerException` and print a clear message  
- Always run a `finally` block to show cleanup logic

## 🧑‍💻 Java Code  
```java
package Exception;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null Reference");
        } finally {
            System.out.println("clean up done");
        }
    }
}


⏱️ Time and Space Complexity
Time Complexity: O(1) — Single method call attempt

Space Complexity: O(1) — No extra memory used

✅ Tip
Avoid nulls wherever possible — use Optional, validations, or defaults.