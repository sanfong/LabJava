public class Pro1 {
    public static void main(String[] args) {
        Account a = new Account(0, 1000);
        SavingsAccount sa = new SavingsAccount(1, 2000);
        CheckingAccount ca = new CheckingAccount(2, 5000, 5000);
        System.out.println("Account");
        System.out.println(a);
        System.out.println("Savings Account");
        System.out.println(sa);
        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: " + ca.getOverdraft());
        System.out.println("Balance is " + ca.getBalance());
        System.out.println("Withdraw: 10000.0");
        ca.withdraw(10000);
        System.out.println(ca);

    }
}