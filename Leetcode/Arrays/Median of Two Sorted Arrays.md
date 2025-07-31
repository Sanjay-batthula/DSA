# 🧠 Problem: 4. Median of Two Sorted Arrays

---

## 🚀 Intuition
We're given two **sorted arrays**, and we need to find the **median** of the combined array **without actually merging** them.

Your first thought might be to merge them and then just pick the middle elements.  
But that takes `O(m + n)` time and `O(m + n)` space — and we can do better with a divide-and-conquer idea.

---

## 🧩 Approach
The trick here is to **find the K-th smallest element** in the union of two sorted arrays — without merging them.

### How it works:
- To find the median:
  - If total length is odd → find `(m + n + 1) / 2`
  - If even → average of `(m + n + 1) / 2` and `(m + n + 2) / 2`
- Use a recursive function `f(i, j, k)`:
  - Finds the k-th smallest element starting from `i` in `nums1` and `j` in `nums2`.
  - At each step, eliminate `k/2` elements from one of the arrays based on value comparison.

This is a **modified binary search** over the two arrays.

---

## ⏱️ Complexity

- **Time Complexity:**  
  $$O(\log (m + n))$$  
  Because we cut `k` in half on every recursive call.

- **Space Complexity:**  
  $$O(\log (m + n))$$ due to recursion stack.

---

## ✅ Code

```java
class Solution {
    private int m;
    private int n;
    private int[] nums1;
    private int[] nums2;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        m = nums1.length;
        n = nums2.length;
        this.nums1 = nums1;
        this.nums2 = nums2;
        int a = f(0, 0, (m + n + 1) / 2);
        int b = f(0, 0, (m + n + 2) / 2);
        return (a + b) / 2.0;
    }

    private int f(int i, int j, int k) {
        if (i >= m) return nums2[j + k - 1];
        if (j >= n) return nums1[i + k - 1];
        if (k == 1) return Math.min(nums1[i], nums2[j]);

        int p = k / 2;
        int x = i + p - 1 < m ? nums1[i + p - 1] : Integer.MAX_VALUE;
        int y = j + p - 1 < n ? nums2[j + p - 1] : Integer.MAX_VALUE;

        return x < y ? f(i + p, j, k - p) : f(i, j + p, k - p);
    }
}
