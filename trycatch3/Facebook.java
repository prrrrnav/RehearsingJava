package trycatch3;

import java.util.Scanner;

public class Facebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        try {
            if (isOnlyDigits(username)) {
                throw new Exception("Invalid username: Name cannot be numbers only.");
            }
            System.out.println("Login successful.");
        } catch (Exception e) {
            System.out.println("Login failed: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Login attempt completed.");
        }
    }


    public static boolean isOnlyDigits(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; 
            }
        }
        return true;
    }
}
