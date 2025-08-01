### 🚫 Illegal Argument Exception – Java

## 🧾 Problem Statement  
You're using a method that expects **valid arguments**.  
If you pass a **logically invalid** value — like a negative delay to `Thread.sleep()` — Java throws an `IllegalArgumentException`.

## 📥 Input  
Call: `Thread.sleep(-100)`

## 📤 Output  
- Catches and prints the `IllegalArgumentException`  
- Also prepared to catch `InterruptedException` (which `Thread.sleep()` can also throw)  
- Always prints `"done"` from the `finally` block

## 💡 Logic  
- `Thread.sleep(long millis)` expects a non-negative value  
- Passing a negative number → Java throws `IllegalArgumentException`  
- You catch both possible exceptions: `IllegalArgumentException` and `InterruptedException`  
- `finally` ensures cleanup message is always printed

## 🔍 My Approach  
1. Call `Thread.sleep()` with `-100` (invalid argument)  
2. Catch `IllegalArgumentException` when thrown  
3. Also handle `InterruptedException` just in case  
4. Always run `finally` for closing steps

## 🧑‍💻 Java Code
```java
package Exception;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            System.out.println("done");
        }
    }
}
```


## ⏱️ Time and Space Complexity
Time Complexity: O(1) — one method call
Space Complexity: O(1) — no data structures used

## ✅ Tip
🧠 Use IllegalArgumentException manually in your methods to guard against bad input:

```java
if (speed < 0) {
    throw new IllegalArgumentException("Speed can't be negative");
}
```
💡 This is great for custom validation in your own APIs or libraries!


