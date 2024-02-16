class MyThread extends Thread {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                // Sleep for a random duration to simulate some work
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // Create two threads with different messages
        MyThread thread1 = new MyThread("Thread 1 - Hello from Thread!");
        MyThread thread2 = new MyThread("Thread 2 - Hi from Thread!");

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}
