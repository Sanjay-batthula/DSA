# Program to find LCM of Two Numbers

Given two positive integers `a` and `b`. Find the Least Common Multiple (LCM) of `a` and `b`.

The **LCM** of two numbers is the smallest number which can be divided by both numbers.  

---

## Examples

**Input:**  
```

a = 10, b = 5

```
**Output:**  
```

10

```
Explanation: 10 is the smallest number divisible by both 10 and 5.  

**Input:**  
```

a = 5, b = 11

```
**Output:**  
```

55

````
Explanation: 55 is the smallest number divisible by both 5 and 11.  

---

## Naive Approach (Using Conditional Loop)

This approach starts from the greater of the two numbers and checks if it is divisible by the smaller one. It keeps incrementing by the larger number until it finds the LCM.  

```java
class GfG {
    static int lcm(int a, int b) {
        int g = Math.max(a, b); 
        int s = Math.min(a, b);

        for (int i = g; i <= a * b; i += g) {
            if (i % s == 0)
                return i;
        }
        return a * b; 
    }

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(lcm(a, b)); 
    }
}
````

**Output:**

```
10
```

**Time Complexity:** `O(min(a, b))`
**Auxiliary Space:** `O(1)`

---

## Efficient Approach (Using GCD → LCM Formula)

We use the mathematical relation between **GCD** and **LCM**:

$$
a \times b = LCM(a, b) \times GCD(a, b)
$$

Rearranging:

$$
LCM(a, b) = \frac{a \times b}{GCD(a, b)}
$$

```java
class GfG {
    // Function for gcd 
    static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(lcm(a, b)); 
    }
}
```

**Output:**

```
10
```

**Time Complexity:** `O(log(min(a, b)))`
**Auxiliary Space:** `O(log(min(a, b)))`

---

```
