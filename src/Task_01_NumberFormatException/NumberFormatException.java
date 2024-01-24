package Task_01_NumberFormatException;

import java.util.Scanner;

public class NumberFormatException {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter an integer: ");

        try {
            int number = Integer.parseInt(scanner.next());
            System.out.println("Everything is fine");
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Exception: " + e);
        }
    }
}
