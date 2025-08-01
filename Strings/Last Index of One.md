### 🧩 Last Index of One – Basic
## 🧾 Problem Statement
You’re given a binary string s made up of only '0' and '1'.
Your task: Find the last index where '1' appears.

If there's no '1' in the string at all, return -1.

## 📥 Input
A binary string s (1 <= |s| <= 10^6)

s contains only characters '0' or '1'

## 📤 Output
Return the last index of '1' in the string.

Return -1 if '1' is not present.

## ✨ Examples
Input
s = "00001"
Output
4

Input
s = "0"
Output
-1

## 💡 Logic
To get the last index of '1':

Start from the end of the string.

Move backward one character at a time.

The first '1' you hit while going backward is the last '1'.

## 🔍 My Approach
Loop from s.length() - 1 to 0

If s.charAt(i) == '1', return i

If the loop ends, return -1

## 🧑‍💻 Java Code
```java
class Solution {
    public int lastIndex(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') return i;
        }
        return -1;
    }
}
```

## ⏱️ Time and Space Complexity
Time Complexity: O(n)

Space Complexity: O(1)

## ✅ Tip
Want it even faster in real life? Use s.lastIndexOf('1') in Java — built-in and optimized. But in coding rounds or interviews, always show the manual logic first to prove you understand it 💡