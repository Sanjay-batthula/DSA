# Swap Two Numbers

**Last Updated:** 23 Jul, 2025

Given two numbers `a` and `b`, the task is to swap them.

---

### Examples:

**Input:**  
a = 2, b = 3  
**Output:**  
a = 3, b = 2

**Input:**  
a = 20, b = 0  
**Output:**  
a = 0, b = 20

**Input:**  
a = 10, b = 10  
**Output:**  
a = 10, b = 10

---

## Table of Contents

- [Naive Approach] Using Third Variable
- [Expected Approach] Without using Third Variable
- [Alternate Approach] Built-in Swap

---

## [Naive Approach] Using Third Variable

The idea is to use a third variable, say `temp`, to store the original value of one of the variables during the swap.

1. Store the value of `a` in `temp`.
2. Assign the value of `b` to `a`.
3. Assign the value of `temp` to `b`.

### Java Code:
```java
class GfG {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("a = " + a + " b = " + b);   

        // Swap a and b using temp variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " b = " + b);
    }
}
```
