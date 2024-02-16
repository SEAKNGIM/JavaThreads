class MyThread extends Thread {
    private String msgiveup;
    private String mswelcom;
    private String msloading;
    private String asterisk;
    private String dash;

    public MyThread(String mswelcom, String asterisk,String msgiveup, String dash, String msloading) {
        this.msgiveup = msgiveup;
        this.asterisk = asterisk;
        this.mswelcom = mswelcom;
        this.msloading = msloading;
        this.dash = dash;
    }
    @Override
    public void run() {
        for (int i = 0; i < mswelcom.length(); i++) {
            System.out.print(mswelcom.charAt(i) + "");
            try {
                // Sleep for a random duration to simulate some work
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(asterisk);
            try {
                // Sleep for a random duration to simulate some work
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < msgiveup.length(); i++) {
            System.out.print(msgiveup.charAt(i) + "");
            try {
                // Sleep for a random duration to simulate some work
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(dash);
            try {
                // Sleep for a random duration to simulate some work
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < msloading.length(); i++) {
            System.out.print(msloading.charAt(i) + "");
            try {
                // Sleep for a random duration to simulate some work
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
      // Create threads with different messages
    MyThread thread = new MyThread("Welcome to CSTAD!\n","*", "\nDon't give up this opportunity, do your best first\n", "-", "\nDownloading..........");

    // Start threads
        thread.start();

    // Wait for threads to finish
        try {
        thread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println("completed 100%.");
}
}
