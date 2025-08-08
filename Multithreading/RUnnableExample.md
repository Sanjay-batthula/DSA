### Runnable Interface Example in Java
## 🧩 Problem Description
Demonstrate how to create a basic thread in Java using the Runnable interface.
The goal is to run a thread that executes code defined in the run() method.

## 📘 Examples

Example Output
Thread is running...
(Note: Output may vary depending on what is written inside the run() method)

## 🔒 Constraints

Implement the Runnable interface

Override the run() method

Pass the Runnable object to a Thread instance

## ✅ Approach
Instead of extending the Thread class, we implement Runnable.
The run() method is overridden to define the task.
We then create a Thread object and pass the Runnable instance to it.
Finally, we call start() on the Thread object to begin execution.

## 🧑‍💻 Code (Java)

```
package MultiThreading;

public class RunnableExample implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        RunnableExample r = new RunnableExample();
        Thread t = new Thread(r);
        t.start();
    }
}
```