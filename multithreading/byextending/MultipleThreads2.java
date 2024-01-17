class MultipleThreads2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + i + " is running: " + i);
        }
    }
    public static void main(String[] args) {
        MultipleThreads2 thread1 = new MultipleThreads2();
        MultipleThreads2 thread2 = new MultipleThreads2();
        MultipleThreads2 thread3 = new MultipleThreads2();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

/*public class MultipleThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
*/