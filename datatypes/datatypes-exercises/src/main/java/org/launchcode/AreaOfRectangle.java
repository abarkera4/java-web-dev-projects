package org.launchcode;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args) {
        Scanner inputwidth = new Scanner(System.in);
        System.out.println("Enter rectangle width: ");
        float width = inputwidth.nextFloat();

        Scanner inputlength = new Scanner(System.in);
        System.out.println("Enter rectangle length: ");
        float length = inputlength.nextFloat();

        float area = width * length;
        System.out.println("The area of a rectangle with length " + length + " and " + width + " is " + area);
    }
}
