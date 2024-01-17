class MultipleThreads extends Thread {
    @Override
    public void run() {
        // Code to be executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }
    public static void main(String[] args) {
        MultipleThreads mt = new MultipleThreads();
        mt.start(); // Start the thread
    }
}
/*
public class ThreadExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // Start the thread
    }
}*/