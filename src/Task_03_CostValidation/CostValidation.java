package Task_03_CostValidation;

import java.util.Scanner;

public class CostValidation {
    private static double ACCOUNT_MONEY = 50;
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        showAccountInfo();
        System.out.println("Please, enter the overall cost of your purchase");
        double price = scanner.nextDouble();
        validateCosts(price);

    }

    private static void showAccountInfo() {
        System.out.println("There are " + ACCOUNT_MONEY + " USD in your bank account");
    }

    private static void validateCosts(double price) {
        double difference = price - ACCOUNT_MONEY;
        if (price > ACCOUNT_MONEY) {
            throw new ArithmeticException("Sorry, there is not enough money in your account," +
                    " you need " + difference +  " USD more to complete the purchase");
        }
        else System.out.println("Purchase complete, thank you for using our services!");
    }
}
