package Task_02_ArrayIndexOutOfBoundsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodsExchange {
    public static void main (String[] args) {
        double[] prices = {72, 72.5, 72.25, 73, 77};
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program shows info about the price of a certain item during a single day in 5-day period");

        while (true) {
            try {
                System.out.println("Please, enter the number of the day you would like to get pricing information for: ");
                int dayIndex = scanner.nextInt();
                dayIndex--;
                showDailyPriceInfo(dayIndex, prices);
                System.out.println("Input anything if you would you like to see info for another day or 'N' to finish");
                if (scanner.next().equalsIgnoreCase("n")) break;
            } catch (InputMismatchException e) {
                System.out.println("Exception: " + e);
                scanner.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception: " + e);
            }
        }
    }

    private static void showDailyPriceInfo(int dayIndex, double[] prices) {
        int displayDayIndex = dayIndex + 1;
        System.out.println("On day " + displayDayIndex  + " the price for the item was " + prices[dayIndex] + " USD");
    }
}
