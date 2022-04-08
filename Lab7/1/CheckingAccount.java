public class CheckingAccount extends Account {
    private double overdraft = 0;
    public CheckingAccount() {
        super();
    }

    public CheckingAccount(int id, double balance, double overdraft) {
        super(id, balance);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return this.overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
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
