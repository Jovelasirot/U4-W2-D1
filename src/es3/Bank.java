package es3;

public class Bank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Grossi mario", 20000.0);

        System.out.println("Balance of account: " + account1.getBalance());

        try {
            account1.withdraw(21750.5);

            System.out.println("Balance: " + account1.getBalance());
        } catch (BankException e) {
            System.out.println("Error:" + e);
            e.printStackTrace();
        }

    }
}
