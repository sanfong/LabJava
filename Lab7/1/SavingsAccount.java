public class SavingsAccount extends Account {
    private double overdraft = 0;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public double getOverdraft() {
        return this.overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraft >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Balance is insufficient");
        }
    }
}
