class DaemonExample extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon Thread is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        DaemonExample t1 = new DaemonExample();
        t1.setDaemon(true); // Set thread as daemon
        t1.start(); // Start Daemon Thread

        System.out.println("Main thread is finished");
    }
}
