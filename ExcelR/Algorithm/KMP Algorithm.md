KMP Algorithm is an efficient searching algorithm
It utilizes the LPS array for the pattern to avoid rescanning the text when a mismatch occurs.
It is very useful when it comes to finding multiple patterns
The naive solution to this problem is to compare the problem with every possible substring of the text.
Starting from the left most position and moving right wards.
This takes O(n*m) time. - where the n is length of teh text, m is the length of the pattern.

```
public class Main {
    public static int[] computeLPSArray(String pattern) {
        int M = pattern.length();
        int[] lps = new int[M];
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < M) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        int[] lps = computeLPSArray(pattern);
        for (int value : lps) {
            System.out.print(value + " ");
        }
    }
}
```


```
public class Main {

    public static int[] computeLPSArray(String pattern) {
        int M = pattern.length();
        int[] lps = new int[M];
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < M) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void KMPSearch(String text, String pattern) {
        int N = text.length();
        int M = pattern.length();
        int[] lps = computeLPSArray(pattern);

        int i = 0; // index for text
        int j = 0; // index for pattern

        while (i < N) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
    
            if (j == M) {
                System.out.println("Found pattern at index " + (i - j));
                j = lps[j - 1];
            } else if (i < N && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        KMPSearch(text, pattern);
    }
}
```


## Practical Applications of KMP Algorithm
KMP is used in many real world apllications where efficient searching is crucial 
-> Text editors and IDEs for the find functionalities.
-> Bio Informatics
-> For searching genetic patterns in DNA sequences.
-> Search Engines - for keyword searching in large volumes of text.
-> Spam filters and intrusion detection systems for pattern matching.


