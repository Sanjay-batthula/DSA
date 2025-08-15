# Sum of First N Natural Numbers

🧩 **Problem Description**  
Given a positive integer `n`, calculate the sum of all natural numbers from 1 to `n`.

📘 **Examples**

- Example 1  
  Input: `n = 3`  
  Output: `6`  
  Explanation: 1 + 2 + 3 = 6

- Example 2  
  Input: `n = 5`  
  Output: `15`  
  Explanation: 1 + 2 + 3 + 4 + 5 = 15

🔒 **Constraints**  
- `1 ≤ n ≤ 10⁹`

✅ **Approaches**

1. **Loop-Based Approach (Naive)**  
   Iterate from 1 to `n`, add each value to the sum.

2. **Formula-Based Approach (Optimized)**  
   Use the formula `sum = n * (n + 1) / 2`

📝 **Time and Space Complexity**  
- Loop Method: `O(n)` time, `O(1)` space  
- Formula Method: `O(1)` time, `O(1)` space

🧑‍💻 **Code (Java - Loop Approach)**

```java
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findSum(n));
    }
}
```
