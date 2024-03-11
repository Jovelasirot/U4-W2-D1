package es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es1 {

    private static final Logger logger = LoggerFactory.getLogger(Es1.class);

    public static void main(String[] args) {


        Random rnd = new Random();
        int[] numArray = new int[5];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = rnd.nextInt(1, 10);
        }

        System.out.println(Arrays.toString(numArray));

        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Insert a number or 0 to terminate the program");
            number = scanner.nextInt();


            if (number != 0) {
                System.out.println("Determine the position (1-5)");
                int position = scanner.nextInt();
                try {
                    if (position < 0 || position > 5) {
                        throw new ArrayIndexOutOfBoundsException("Invalid position");
                    }
                    numArray[position - 1] = number;
                    printArray(numArray);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    logger.error("Error: " + ex);
                }
            }

        } while (number != 0);


        scanner.close();
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
