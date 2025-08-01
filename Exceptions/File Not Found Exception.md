### 📁 File Not Found – Java Exception Handling

## 🧾 Problem Statement  
You want to open a file using Java. But what if the file doesn’t exist?  
Instead of crashing the program, you should catch the error and handle it gracefully using a `try-catch` block.

## 📥 Input  
A file path – `src/Exception/file.txt` (can be any file)  
If the file doesn't exist, the program should handle it properly.

## 📤 Output  
If file exists → print “File opened”  
If not → print an error message and stack trace

## 💡 Logic  
Java throws a `FileNotFoundException` when it can’t find the file you're trying to open.  
Use a `try-catch` block to catch it and prevent your app from crashing.

## 🔍 My Approach  
- Use `FileInputStream` to open the file.  
- Wrap it in `try-catch`.  
- If file opens → print message.  
- If not → catch the exception and show a custom message.

## 🧑‍💻 Java Code
```java
package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/Exception/file.txt");
            if (fis != null) {
                System.out.println("File opened");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Please enter the correct file name");
            e.printStackTrace();
        }
    }
}


## ⏱️ Time and Space Complexity
Time Complexity: O(1) — file opening is constant time (OS-level)
Space Complexity: O(1) — just handling a stream

## ✅ Tip
Always check if a file exists before trying to open it. Or just wrap it in a try-catch like this — it's clean, and safe, and saves your app from crashing 💥