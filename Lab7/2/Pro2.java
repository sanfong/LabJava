public class Pro2 {
    public static void main(String[] args) {
        Account a = new Account("George", 1122, 1000);
        a.setAnnualInterestRate(1.5);
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        System.out.println(a);
        System.out.printf("%s%35s%17s%16s\n", "Date", "Type", "Amount", "Balance");
        a.getTransactions().forEach(t -> System.out.printf("%-35s%-15c%-15.2f%.2f\n", t.getDate(), t.getType(), t.getAmount(), t.getBalance()));
    }
}