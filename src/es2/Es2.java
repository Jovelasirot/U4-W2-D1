package es2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Es2 {

    private static final Logger logger = LoggerFactory.getLogger(Es2.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("How many km have you traveled?");
            double km = scanner.nextDouble();

            System.out.println("How much gas have you consumed?");
            double liters = scanner.nextDouble();

            if (liters <= 0) {
                throw new IllegalAccessException("Gas consumed can't be less than/or zero.");
            }
            double efficiency = km / liters;
            System.out.println("Efficiency: " + efficiency + " km/l");

        } catch (IllegalAccessException ex) {
            System.out.println("Error: " + ex.getMessage());
            logger.error("Gas consumed can't be less than/or zero innit");
        } finally {
            scanner.close();
        }

    }
}
