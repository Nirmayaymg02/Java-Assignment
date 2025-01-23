class ThreadA extends Thread {
    public void run() {
        System.out.println("Thread A is running");
    }
}

class ThreadB extends Thread {
    public void run() {
        System.out.println("Thread B is running");
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start(); // Start ThreadA
        t2.start(); // Start ThreadB
    }
}
