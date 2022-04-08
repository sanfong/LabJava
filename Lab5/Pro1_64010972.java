import java.util.Date;

public class Pro1_64010972 {
    public static void main(String[] args) {
        Account ac = new Account(1122, 20000);
        ac.setAnnualInterestRate(4.5);
        ac.withdraw(2500);
        ac.deposit(3000);
        System.out.println(ac.getBalance());
        System.out.println(ac.getMonthlyInterest());
        System.out.println(ac.getDateCreated());
    }
}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }
}