# 🌀 Find Duplicates in an Array – Medium

## 🧾 Problem Statement

Given an array of integers of size `n`, **find all the elements that appear more than once** in the array.  
You must return the duplicate elements in **ascending order**.

---

## 📥 Input

- First line: An integer `n` (size of the array)  
- Second line: `n` space-separated integers (the array elements)

---

## 📤 Output

- A space-separated list of duplicate elements in **ascending order**
- If no duplicates are found, print `-1`

---

## ✨ Example

### Input
8
1 3 2 3 4 6 5 1


### Output
1 3


---

## 📌 Constraints

- `1 <= n <= 10^5`  
- `0 <= arr[i] <= 10^5`

---

## 💡 Logic

- Use a frequency counter (like a simple array or hashmap) to keep track of how many times each element appears.
- If the count becomes more than 1, it's a duplicate.
- After scanning, collect and sort all elements that appear more than once.

---

## 🔍 My Approach

1. Read `n` and the array elements.
2. Create a frequency array (or map) to count occurrences.
3. Traverse the array, update frequency.
4. Collect all elements with frequency > 1.
5. Sort them and print.
6. If none found, print `-1`.

---

## 🧑‍💻 Java Code

```java
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> duplicates = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        if(duplicates.isEmpty()) {
            System.out.println("-1");
        } else {
            Collections.sort(duplicates);
            for(int num : duplicates) {
                System.out.print(num + " ");
            }
        }
    }
}
```

## ⏱️ Time and Space Complexity
Time Complexity: O(n log n)
(due to final sorting step)

Space Complexity: O(n)
(for storing frequencies and result list)

## ⚠️ Note
Don't confuse this with printing duplicates more than once.

Only print each duplicate once, even if it appears 3+ times.

Using a HashMap is clean and works well within constraints.

