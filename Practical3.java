// Write a Java program to multiply two floating-point numbers.

import java.util.Scanner;

public class Practical3 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter first floating-point number: ");
      float num1 = sc.nextFloat();

      System.out.print("Enter second floating-point number: ");
      float num2 = sc.nextFloat();

      float result = num1 * num2;

      System.out.println("Multiplication = " + result);

      sc.close();
   }
}