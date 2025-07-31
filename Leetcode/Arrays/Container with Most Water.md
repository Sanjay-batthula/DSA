# 🚰 LeetCode: 11. Container With Most Water

---

## 🧠 Intuition
You're given an array where each index represents a vertical line.  
You want to **trap the most water** between two lines — like walls of a container.

At first glance, brute force might seem fine — try every pair. But that’s too slow.

The trick: use **two pointers**, one at each end, and move the pointer that's at the shorter line — because the width is decreasing, and we want to maximize the height * width combo.

---

## 📐 Approach
1. Initialize two pointers: `i = 0` (left), `j = n - 1` (right).
2. Track the **max area** seen so far.
3. While `i < j`:
   - Calculate area = `min(height[i], height[j]) * (j - i)`
   - Update max area.
   - Move the pointer at the **shorter height** inward (potential for taller container).
4. Repeat until they meet.

This is a classic **two-pointer optimization** problem.

---

## ⏱️ Complexity

- **Time Complexity:**  
  $$O(n)$$ — Single pass through the array.

- **Space Complexity:**  
  $$O(1)$$ — Just a few pointers and variables.

---

## ✅ Code (Java)

```java
class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int ans = 0;
        while (i < j) {
            int t = Math.min(height[i], height[j]) * (j - i);
            ans = Math.max(ans, t);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}
