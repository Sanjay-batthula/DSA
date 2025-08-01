### 📖 File Reading with Exception Handling – Java

## 🧾 Problem Statement  
You need to open and read a file in Java.  
While doing that, two things could go wrong:  
- File might not exist (`FileNotFoundException`)  
- Some error might happen during reading (`IOException`)  

Your job? Handle both and read the file safely.

## 📥 Input  
A file located at: `src/Exception/file.txt`

## 📤 Output  
If file exists → print `"File opened"` and the contents of the file.  
If not → show error message.

## 💡 Logic  
- Use `FileInputStream` to open the file.  
- Read the file byte by byte (`fis.read()`), convert to `char`, and print.  
- Catch exceptions (`FileNotFoundException` and `IOException`) to avoid crashes.  
- Close the file when done ✅

## 🔍 My Approach  
1. Open the file using `FileInputStream`.  
2. Read each byte until end of file (`read() != -1`).  
3. Print each character.  
4. Wrap the code inside `try-catch` blocks to handle both exceptions.  
5. Always close the file after you're done.

## 🧑‍💻 Java Code
```java
package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/Exception/file.txt");
            System.out.println("File opened");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Please enter the correct file name");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error while reading the file");
            e.printStackTrace();
        }
    }
}

## ⏱️ Time and Space Complexity
Time Complexity: O(n) — where n is the number of characters in the file
Space Complexity: O(1) — we’re not storing the data, just printing it

## ✅ Tip
💡 Always close your file streams using fis.close() to avoid memory leaks.