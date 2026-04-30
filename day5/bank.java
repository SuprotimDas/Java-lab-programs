interface Bank {
    void deposit(double amt);
    void withdraw(double amt);
}

class Customer {
    String name;

    Customer(String n) {
        name = n;
    }
}

class Account extends Customer implements Bank {
    double balance = 0;

    Account(String n) {
        super(n);
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void show() {
        System.out.println(name + " Balance: " + balance);
    }
}

public class bank {
    public static void main(String[] args) {
        Account a = new Account("Rahul");
        a.deposit(1000);
        a.withdraw(500);
        a.show();
    }
}