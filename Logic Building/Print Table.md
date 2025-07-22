Print Table  
The problem can be found at the following link: 🔗 *Custom Problem - No external link*

🧩 Problem Description  
Given a number `n`, print its multiplication table from 1 to 10.

📘 Examples  
Example 1  
Input: n = 5  
Output:  
5 * 1 = 5  
5 * 2 = 10  
...  
5 * 10 = 50  

Example 2  
Input: n = 2  
Output:  
2 * 1 = 2  
...  
2 * 10 = 20

🔒 Constraints  
1 ≤ n ≤ 10⁹  

✅ My Approach  
We can use a simple `for` loop from 1 to 10.  
Multiply the given number with the iterator and print the result.

📝 Time and Auxiliary Space Complexity  
Expected Time Complexity: O(1)  
Expected Auxiliary Space Complexity: O(1)

🧑‍💻 Code (Java)
```java
public class PrintTable {
    public static void printTable(int n) {
        for (int i = 1; i <= 10; ++i)
            System.out.println(n + " * " + i + " = " + (n * i));
    }

    public static void main(String[] args) {
        int n = 5;
        printTable(n);
    }
}
