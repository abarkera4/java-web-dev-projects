package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner inputRadius = new Scanner(System.in);
        double radius = -1;

        do {
            System.out.println("Enter a radius: ");
            String userInput = inputRadius.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter a valid number.");
                continue;
            }
            try {
                radius = Double.parseDouble(userInput);

                if (radius < 0) {
                    System.out.println("Radius cannot be negative. Please enter a positive number.");
                    radius = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        } while (radius < 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
