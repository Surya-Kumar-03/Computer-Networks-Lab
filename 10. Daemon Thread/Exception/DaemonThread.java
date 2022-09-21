public class DaemonThread extends Thread {
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Check if its DaemonThread: " +
            Thread.currentThread().isDaemon());
    }
    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
        t1.start();
        // Exception as the thread is already started
        t1.setDaemon(true);
        t2.start();
    }
}