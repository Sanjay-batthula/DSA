Even or Odd  

🧩 Problem Description  
Given an integer `n`, determine whether it is even or odd.  
Return `true` if the number is even, and `false` if the number is odd.

📘 Examples  
Example 1  
Input: n = 4  
Output: true  
Explanation: 4 is divisible by 2, so it is even.

Example 2  
Input: n = 7  
Output: false  
Explanation: 7 is not divisible by 2, so it is odd.

🔒 Constraints  
-10⁹ ≤ n ≤ 10⁹  

✅ My Approach  
Use the modulus operator `%` to check for evenness.  
If `n % 2 == 0`, return `true`. Else, return `false`.

📝 Time and Auxiliary Space Complexity  
Expected Time Complexity: O(1)  
Expected Auxiliary Space Complexity: O(1)

🧑‍💻 Code (Java)
```java
class Solution {
    public boolean isEven(int n) {
        return n % 2 == 0;
    }
}
