package Task_04_TemperatureControl;

import java.util.Scanner;

public class TemperatureControl {
    private static double MAX_TEMPERATURE = 35;
    private static double MIN_TEMPERATURE = -10;
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the current device environment temperature");
        double temperature = scanner.nextDouble();
        compareCurrentTemperatureWithLimits(temperature);
    }

    private static void compareCurrentTemperatureWithLimits(double temperature) {
        if (temperature > MAX_TEMPERATURE) {
            try {
                throw new MyException("Current temperature is higher than device's maximum threshold! " +
                        "Device will softly shutdown to prevent damage.");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        else if (temperature < MIN_TEMPERATURE) {
            try {
                throw new MyException("Current temperature is below device's minimum threshold! " +
                        "Device will softly shutdown to prevent damage.");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        else System.out.println("Temperature is within device limits.");
    }
}
