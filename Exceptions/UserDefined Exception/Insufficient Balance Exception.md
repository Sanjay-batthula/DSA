### 💸 User Defined Exception – Insufficient Balance in Java

## 🧾 Problem Statement  
You're simulating a bank withdrawal system.  
A customer shouldn't be allowed to withdraw more than their current balance.  
If they try, throw a custom exception called `InsufficeBalanceException`.

## 📥 Input  
- Bank account created with a certain balance (e.g., 10)  
- A withdrawal request (e.g., 1500)

## 📤 Output  
- If the amount ≤ balance: withdraw and show new balance  
- If amount > balance: throw and catch `InsufficeBalanceException`  
- Always print cleanup info using `finally`

## ✨ Example  

### Input  
Balance: 10  
Withdraw: 1500  

### Output  
Insufficient Balance
Cleanup done


---

### Input  
Balance: 1000  
Withdraw: 500  

### Output  
Withdraw Successful. Balance: 500
Cleanup done


## 💡 Logic  
If the withdrawal amount exceeds the current balance,  
a user-defined exception `InsufficeBalanceException` is thrown.  
It’s a clean way to enforce business rules (no negative balances) 🚫💰

## 🔍 My Approach  
- Created a class `InsufficeBalanceException` extending `Exception`  
- Initialized balance in a `BankAccount` class  
- Wrote `withdraw()` method to check amount  
- If invalid: throw the custom exception  
- Used `try-catch-finally` in `main()` to handle it all gracefully

## 🧑‍💻 Java Code  
```java
package Exception.UserDefined;

class InsufficeBalanceException extends Exception {
    public InsufficeBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;
    public BankAccount(int balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficeBalanceException {
        if(amount > balance) {
            throw new InsufficeBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdraw Successful. Balance: " + balance);
    }
}

public class InsufficientBalanceException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10);
        try {
            account.withdraw(1500);
        } catch(InsufficeBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cleanup done");
        }
    }
}

## ⏱️ Time and Space Complexity
Time Complexity: O(1) — Single condition check and arithmetic

Space Complexity: O(1) — No additional data structures

## ✅ Tip
User-defined exceptions make business logic crystal clear.