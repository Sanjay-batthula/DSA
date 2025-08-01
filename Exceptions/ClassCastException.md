### 🧪 Class Cast Exception – Java

## 🧾 Problem Statement  
You're trying to cast an object of one type into another incompatible type.  
If the types aren’t related, Java throws a `ClassCastException` at **runtime** (not compile-time).

## 📥 Input  
An `Object` that holds an `Integer` value  
Attempt to cast it to a `String`

## 📤 Output  
- Catches and prints the `ClassCastException`  
- Always prints "Cleanup done" from the `finally` block

## 💡 Logic  
- `Object obj = new Integer(10)` means `obj` actually holds an `Integer`  
- Casting it directly to a `String` is invalid  
- Java throws `ClassCastException` at runtime  
- `try-catch-finally` is used to gracefully handle and recover

## 🔍 My Approach  
1. Create an object as `new Integer(10)`  
2. Attempt to cast it to `String` — illegal operation  
3. Catch the exception  
4. Use `finally` to do final cleanup (no matter what happens)

## 🧑‍💻 Java Code
```java
package Exception;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            Object obj = new Integer(10);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleanup done");
        }
    }
}
```

## ⏱️ Time and Space Complexity
Time Complexity: O(1) — just one cast operation
Space Complexity: O(1) — no data stored

## ✅ Tip
🚨 This kind of exception slips through compile-time checks because Java allows upcasting to Object.
🔒 Always check with instanceof before casting:

```java
if (obj instanceof String) {
    String str = (String) obj;
}
```