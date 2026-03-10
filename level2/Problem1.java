// Program to calculate area of triangle in square inches and square centimeters

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter the height in cm: ");
        double height = input.nextDouble();

        // Calculate area
        double areaSqCm = 0.5 * base * height;

        // Convert to square inches
        double areaSqIn = areaSqCm / 6.4516;

        // Display result
        System.out.println("The Area of the triangle in sq in is "
                + areaSqIn + " and sq cm is " + areaSqCm);

        input.close();
    }
}