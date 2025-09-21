import java.util.ArrayList;
import java.util.List;

// Thread-safe wrapper around ArrayList
class SafeArrayList {
    private final List<String> list = new ArrayList<>();

    // Add element
    public synchronized void add(String element) {
        list.add(element);
        System.out.println(Thread.currentThread().getName() + " added: " + element);
    }

    // Remove element
    public synchronized boolean remove(String element) {
        boolean removed = list.remove(element);
        System.out.println(Thread.currentThread().getName() + " removed: " + element + " -> " + removed);
        return removed;
    }

    // Get current size
    public synchronized int size() {
        return list.size();
    }

    // Print all elements
    public synchronized void printAll() {
        System.out.println("Elements: " + list);
    }
}

// Test class to demonstrate thread-safety
public class ThreadSafeListTest {
    public static void main(String[] args) {
        SafeArrayList safeList = new SafeArrayList();

        // Thread 1 adds elements
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                safeList.add("A" + i);
                try {
                    Thread.sleep(50); // simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Adder-1");

        // Thread 2 adds elements
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                safeList.add("B" + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Adder-2");

        // Wait a bit for some elements to and Thread 3 checks element exist or not if exist remove else not exist
        Thread t3 = new Thread(() -> {
            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();}
                safeList.remove("A3");
                safeList.remove("B7");

        }, "Adder-2");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal size: " + safeList.size());
        safeList.printAll();
    }
}
