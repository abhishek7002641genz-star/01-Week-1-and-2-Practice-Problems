// Program to convert temperature from Celsius to Fahrenheit

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit");

        input.close();
    }
}