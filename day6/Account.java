abstract class Accounts {
    double balance;
    int accNo;
    String name, address;

    Accounts(int accNo, String name, String address, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    abstract void withdraw(double amt);
    abstract void deposit(double amt);

    void display() {
        System.out.println(accNo + " " + name + " Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rate;

    SavingsAccount(int accNo, String name, String address, double balance, double rate) {
        super(accNo, name, address, balance);
        this.rate = rate;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void calculateAmount() {
        balance += balance * rate / 100;
    }
}

public class Account {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1,"Amit","Kolkata",1000,5);
        s.deposit(500);
        s.withdraw(200);
        s.calculateAmount();
        s.display();
    }
}