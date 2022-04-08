import java.util.Date;
import java.util.Scanner;

public class Pro6_64010972 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Account[] accs = new Account[10];
        for (int i = 0; i < accs.length; i++) {
            accs[i] = new Account(i, 100);
        }
        while (true) {
            int id = askInt("Enter an id: ", 0, 9);
            int choice;
            do {
                System.out.println("\nMain menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
                choice = askInt("Enter a choice: ", 1, 4);
                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accs[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        accs[id].withdraw(scan.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        accs[id].deposit(scan.nextDouble());
                        break;
                    case 4:
                        System.out.println("End of Program.");
                        break;
                }
            } while (choice != 4);
        }
    }

    public static int askInt(String prompt, int min, int max) {
        System.out.print(prompt);
        try {
            int id = scan.nextInt();
            if (min <= id && id <= max) {
                return id;
            }
            throw new Exception();
        } catch (Exception e) {
            scan.nextLine();
            return askInt(prompt, min, max);
        }
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