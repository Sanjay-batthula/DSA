### 👶 User Defined RuntimeException – Invalid Age in Java

## 🧾 Problem Statement  
You're setting a person's age, but not everyone lives to 500, right?  
Accept only realistic ages between **0 and 150**.  
If the user enters anything outside that range, throw a custom `InvalidAgeException` (extending `RuntimeException`).

## 📥 Input  
An integer value (age) given through method call.

## 📤 Output  
- If age is valid: print confirmation  
- If age is invalid: throw and catch `InvalidAgeException`  
- Always: print cleanup message in `finally`

## ✨ Example  

### Input  
-5

### Output  
Invalid age: -5
cleanup done


---

### Input  
30

### Output  
Age set to: 30
cleanup done


## 💡 Logic  
Age must be between 0 and 150.  
Anything else is just not human 👽  
So when the input is invalid, we throw our custom unchecked exception `InvalidAgeException`.

## 🔍 My Approach  
- Created `InvalidAgeException` by extending `RuntimeException`  
- Inside `setAge()` method, added range checks  
- If age is outside [0, 150], throw the exception  
- In `main()`, wrapped the setter in `try-catch-finally`

## 🧑‍💻 Java Code  
```java
package Exception.UserDefined;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    int age;
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        System.out.println("Age set to: " + age);
    }
}

public class InvalidAgeExceptionExample {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("cleanup done");
        }
    }
}
```


## ⏱️ Time and Space Complexity
Time Complexity: O(1) — Simple validation

Space Complexity: O(1) — No extra data stored

## ✅ Tip
If the exception is due to a programming bug or bad input logic, using RuntimeException makes sense.
No need to force checked handling — just make sure devs know the rule 📏