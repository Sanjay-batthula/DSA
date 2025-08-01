### 🚨 Array Index Out of Bounds – Try-Catch-Finally Basics

## 🧾 Problem Statement  
You're working with an array in Java and accidentally try to access an index that **doesn't exist**.  
Your task: Handle this **ArrayIndexOutOfBoundsException** using proper Java exception handling mechanisms.

## 📥 Input  
An integer array: `{1, 2, 3, 4, 5}`  
Attempted access at an invalid index: `arr[5]`

## 📤 Output  
Catch and print the exception, and always print a cleanup message using `finally`.

## ✨ Example  
**Code tries to access:**  
`arr[5]` (which is out of bounds — max valid index is 4)

**Expected Output:**  
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5


## 💡 Logic  
Arrays in Java are **0-indexed**.  
So, for an array of length 5, valid indices are 0 through 4.

Trying to access `arr[5]` triggers an exception.

We wrap it in a try-catch block, catch the specific exception, and print it.  
The `finally` block ensures that any cleanup (like closing resources) runs no matter what.

## 🔍 My Approach  
- Try accessing `arr[5]`
- Catch `ArrayIndexOutOfBoundsException` and print it
- Use `finally` to show a "clean-up" step (good habit in real-world coding)

## 🧑‍💻 Java Code  
```java
package Exception;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Clean up done");
        }
    }
}
```


## ⏱️ Time and Space Complexity
Time Complexity: O(1) – Single access attempt

Space Complexity: O(1) – No extra space used

## ✅ Tip
Always go specific first — catch ArrayIndexOutOfBoundsException instead of the generic Exception.
It shows clarity and precision in your understanding 🔍