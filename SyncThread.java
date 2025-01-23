class BankAccount2 {
    private int balance = 800;
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance-= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient funds.");
        }
    }
}
public class SyncThread {
    public static void main(String[] args) {
        BankAccount2 account = new BankAccount2();
        Runnable withdrawTask = ()-> account.withdraw(500);
        Thread user1 = new Thread(withdrawTask, "User 1");
        Thread user2 = new Thread(withdrawTask, "User 2");
        user1.start();
        user2.start();
    }
}
