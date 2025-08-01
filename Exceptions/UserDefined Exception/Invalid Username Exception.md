### 🧑‍💻 User Defined RuntimeException – Invalid Username in Java

## 🧾 Problem Statement  
You’re validating a username input.  
A username should **never be empty** or `null`. If it is, throw a custom exception called `InvalidUsernameException`.

## 📥 Input  
A `String` value representing the username (from a method call).

## 📤 Output  
- If the username is valid: print confirmation  
- If it’s null or empty: throw and catch `InvalidUsernameException`

## ✨ Example  

### Input  
`""`

### Output  
Username cannot be empty


---

### Input  
`"chakra"`

### Output  
Valid Username chakra


## 💡 Logic  
If a user enters an empty string or doesn’t enter anything (`null`),  
that’s not a valid username.  
This is where you raise a custom `RuntimeException` to show what went wrong — clean and clear 💡

## 🔍 My Approach  
- Created `InvalidUsernameException` extending `RuntimeException`  
- Made a `UserValidator` class with `validateUsername()` method  
- Checked if the string is `null` or `.isEmpty()`  
- If it fails: boom, throw the exception  
- Used a `try-catch` in `main()` to handle it smoothly  

## 🧑‍💻 Java Code  
```java
package Exception.UserDefined;

class InvalidUsernameException extends RuntimeException {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class UserValidator {
    String username;
    public void validateUsername(String username) throws InvalidUsernameException {
        if (username == null || username.isEmpty()) {
            throw new InvalidUsernameException("Username cannot be empty");
        }
        System.out.println("Valid Username " + username);
    }
}

public class InvalidUsernameExceptionExample {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        try {
            validator.validateUsername("chakra");
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

## ⏱️ Time and Space Complexity
Time Complexity: O(1) — One condition check

Space Complexity: O(1) — No extra space used

## ✅ Tip
Validating user input early prevents bugs later.
Custom exceptions help you give precise, meaningful feedback — no more guessing what went wrong 🙅


