### Basic Thread Example in Java
## 🧩 Problem Description
Create a basic multithreaded Java program using the Thread class.
Each thread should print its own name when it runs.

## 📘 Examples

Example Output

Thread Name: Scooby  
Thread Name: Shaggy
(Note: The order may vary depending on thread scheduling by the JVM)

## 🔒 Constraints

Use Thread class directly

Override the run() method

Use the constructor to name threads

## ✅ Approach
We create a class MyThread that extends Thread.
Inside the constructor, we call super(name) to set the thread name.
Then, we override the run() method to print the thread's name.
Finally, we start both threads using the start() method which internally calls run().

## 🧑‍💻 Code (Java)
```
package MultiThreading;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread Name: " + this.getName());
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Scooby");
        MyThread t2 = new MyThread("Shaggy");

        t1.start();
        t2.start();
    }
}
```