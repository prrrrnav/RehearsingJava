package trycatchfinally;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exec1{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    try {
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = a/b;
        System.out.println("The result is: " + c);
    } catch (InputMismatchException e) {
        System.out.println("Please enter Integer values only");
    }
    catch(ArithmeticException e) {
        System.out.println("Division by zero is not allowed");
    }
    finally {
        System.out.println("This block is always executed");
        sc.close();
    }
 }
}

