// Write a Java program to read an integer from standard input and display it.

import java.util.Scanner;

public class Practical1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read an integer from the user
        int number = sc.nextInt();

        // Display the integer
        System.out.println("The entered integer is: " + number);

        sc.close();
    }
}