### ➗ Arithmetic Exception – Division By Zero in Java

## 🧾 Problem Statement  
You're taking two numbers from user input and dividing them.  
But wait – what if the second number is `0`? Boom 💥 – **ArithmeticException** incoming!

Your task: Handle this exception properly using `try-catch-finally`.

## 📥 Input  
Two integers `a` and `b`, entered by the user via console.

## 📤 Output  
- If `b != 0`: print the division result  
- If `b == 0`: catch and print the exception  
- Always: print a cleanup/final message using `finally`

## ✨ Example  

### Input  
10
0


### Output  
java.lang.ArithmeticException: / by zero
Finally block executed


---

### Input  
20
4

### Output
The division is: 5
Finally block executed


## 💡 Logic  
Division by zero isn't allowed in Java.  
When `b == 0`, doing `a / b` throws an `ArithmeticException`.

We wrap the division in a `try-catch`, so if the user gives a zero, we gracefully handle the crash 💻💥

The `finally` block? It runs **no matter what** — a perfect place for closing resources or showing that the program handled things responsibly.

## 🔍 My Approach  
- Read `a` and `b` using `Scanner`  
- Perform `a / b` inside a `try` block  
- Catch the `ArithmeticException` and print it  
- Use `finally` to log cleanup behavior

## 🧑‍💻 Java Code  
```java
package Exception;
import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("The division is: " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
```


## ⏱️ Time and Space Complexity
Time Complexity: O(1) — One division operation

Space Complexity: O(1) — No extra space used

## ✅ Tip
Always validate inputs in real-world apps — don’t blindly trust user input.
