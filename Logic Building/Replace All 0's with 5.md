# 🔁 Replace All 0's with 5

## 📝 Problem Description  
You are given an integer `n`. Replace **every digit `0`** in `n` with `5`, and return the updated number.

---

## 💡 Examples  

### Example 1:
**Input:**  
```text
n = 1004
```

**Output:** 
1554


## Explanation:
There are two zeroes in 1004. After replacing both with 5, we get 1554.

## Example 2:
## Input:
n = 121

## Output:
121

## Explanation:
There are no zeroes in the number, so it remains unchanged.


## 🔒 Constraints
0 ≤ n ≤ 10⁴

## 🚀 Approach
Loop through each digit of the number.
If a digit is 0, replace it with 5.
Construct the new number from modified digits.

## ⏱️ Time and Space Complexity
Time Complexity: O(log₁₀(n)) — one pass through each digit
Space Complexity: O(1) — no extra space used

## 💻 Code (Java)
```
class Solution {
    int convertfive(int num) {
        if (num == 0) return 5;

        int result = 0, place = 1;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) digit = 5;
            result += digit * place;
            place *= 10;
            num /= 10;
        }
        return result;
    }
}
```

## 🧪 Test Cases
Test Case 1:
Input: 1004
Output: 1554

Test Case 2:
Input: 0
Output: 5

Test Case 3:
Input: 987
Output: 987

## 🧠 Tip
If you wanna handle this as a string instead of digits, you can convert n to a string, use .replace('0', '5'), and convert back to int — but this numeric way is cleaner and faster for interviews.


