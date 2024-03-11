package es3;

public class BankAccount {
    final int maxMovements = 50;
    String owner;
    int nMovements;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        nMovements = 0;
    }

    void withdraw(double x) throws BankException {

        try {
            if (nMovements >= maxMovements) {
                throw new BankException("Maximum movements reached.");
            }
            if (x > balance) {
                throw new BankException("Insufficient funds (；☉_☉) ");
            }
        } catch (BankException e) {
            System.out.println("Error: " + e.getMessage());
        }
        balance -= x;
        nMovements++;
    }

    double getBalance() {
        return balance;
    }
}

