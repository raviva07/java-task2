public class Account {
    double balance;

    public Account() {
        this.balance = 0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be positive.");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Balance: " + balance);
    }


    public static void main(String[] args) {
        Account a1 = new Account();         
        Account a2 = new Account(1000.0);    

        a1.deposit(500);
        a1.withdraw(200);
        a1.display();

        a2.withdraw(1200); 
        a2.deposit(800);
        a2.display(); 
    }
}
