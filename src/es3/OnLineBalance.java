package es3;

public class OnLineBalance extends BankAccount {
    double maxWithdraw;

    public OnLineBalance(String owner, double balance, double maxWithdraw) {
        super(owner, balance);
        this.maxWithdraw = maxWithdraw;
    }

    void printBalance() {
        System.out.println("Owner: " + owner + " - Funds: " + balance + " - Max movements: " + maxMovements + " - Max withdraw possible: " + maxWithdraw);
    }

    void withdraw(double x) throws BankException {
        try {
            if (x > maxWithdraw) {
                throw new BankException("The withdraw is unavailable");
            }
            super.withdraw(x);
        } catch (BankException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
