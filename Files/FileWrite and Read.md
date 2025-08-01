### ✍️ File Write & Read – Java with Exception Handling

## 🧾 Problem Statement  
Create a program in Java that:
- Accepts user input line-by-line and writes it to a file.
- Stops input when the user types `"exit"`.
- Then reads and prints the content of the file.

All while handling exceptions like a pro 🚫💣

## 📥 Input  
- User enters multiple lines of text.  
- Ends input by typing `"exit"`

## 📤 Output  
- Written content is stored in `src/Exception/file.txt`  
- Program then reads and prints the content line-by-line from that file.

## 💡 Logic  
- Use `FileWriter` to write content to a file.  
- Use `FileReader` to read from the same file.  
- Wrap everything in a `try-catch` block to handle `IOException`.

## 🔍 My Approach  
1. Use `Scanner` to take user input.  
2. Use a loop to collect input lines.  
3. Stop writing if user types `"exit"`.  
4. After writing, use `FileReader` to read content and print it.  
5. Handle all exceptions cleanly.

## 🧑‍💻 Java Code
```java
package Exception;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content to write into the file (type 'exit' to stop):");

        try {
            FileWriter fw = new FileWriter("src/Exception/file.txt");

            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) break;
                fw.write(line + "\n");
            }
            fw.close();

            System.out.println("\nReading from file:");
            FileReader fr = new FileReader("src/Exception/file.txt");
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            fr.close();

        } catch (IOException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }

        sc.close();
    }
}
```

## ⏱️ Time and Space Complexity
Time Complexity:

Writing: O(n) where n is total characters written

Reading: O(m) where m is total characters read

Space Complexity: O(1) – no extra space used except input buffer

## ✅ Tip
📌 For better file handling, use BufferedWriter and BufferedReader for bigger files
📌 Want auto-close magic? Use try-with-resources so you don’t need to manually close streams