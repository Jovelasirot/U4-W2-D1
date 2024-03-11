package es3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {

    private static final Logger logger = LoggerFactory.getLogger(Bank.class);

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Grossi mario", 20000.0);

        System.out.println("Balance of account: " + account1.getBalance());

        try {
            account1.withdraw(21750.5);

            System.out.println("Balance: " + account1.getBalance());
        } catch (BankException e) {
            System.out.println("Error:" + e);
            e.printStackTrace();
            logger.error("Not enough funds");
        }

    }
}
