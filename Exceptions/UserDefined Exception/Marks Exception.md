### 🚫 User Defined Exception – Invalid Marks in Java

## 🧾 Problem Statement  
You're taking a student's marks as input.  
Valid marks range between **0 and 100** only.  
If the input is outside this range, throw a **custom exception** called `MarksException`.

## 📥 Input  
An integer value (marks) from user input using `Scanner`.

## 📤 Output  
- If marks are in range: print the marks  
- If not: throw and catch a custom `MarksException`  
- Stack trace should be shown if marks are invalid

## ✨ Example  

### Input  
110

### Output  
Exception.UserDefined.MarksException: Invalid Marks
at Exception.UserDefined.Marks.getMarks(Marks.java:18)
at Exception.UserDefined.Marks.main(Marks.java:24)


---

### Input  
76

### Output  
The marks is 76


## 💡 Logic  
Marks outside the `0-100` range are invalid.  
We create a custom class `MarksException` that extends `Exception`.  
Then, we throw this exception manually when invalid input is given.  
This is how you create real-world, domain-specific validations 🧠

## 🔍 My Approach  
- Created `MarksException` class extending `Exception`  
- Overloaded constructors for default and custom messages  
- Used `Scanner` to read input  
- Checked if marks are in range  
- If not, threw `MarksException` and caught it using `try-catch`  
- Used `e.printStackTrace()` to print detailed error

## 🧑‍💻 Java Code  
```java
package Exception.UserDefined;

import java.util.Scanner;

class MarksException extends Exception {
    public MarksException() {
        super("Marks must be between 0 and 100");
    }
    public MarksException(String message) {
        super(message);
    }
}

public class Marks {
    int marks;
    void getMarks() {
        try {
            Scanner sc = new Scanner(System.in);
            marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                throw new MarksException("Invalid Marks");
            }
            System.out.println("The marks is " + marks);
        } catch (MarksException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Marks m = new Marks();
        m.getMarks();
    }
}

## ⏱️ Time and Space Complexity
Time Complexity: O(1) — Constant time input check

Space Complexity: O(1) — No extra space used

## ✅ Tip
Custom exceptions make your code more readable and domain-aware.