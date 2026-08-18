// Write a Java program to accept different types of input from the user using the Scanner class.

import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\n--- Entered Details ---");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Character: " + ch);
        System.out.println("Name: " + name);

        sc.close();
    }
}