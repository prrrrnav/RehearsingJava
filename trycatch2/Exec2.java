package trycatch2;

public class Exec2 {
    public static void main(String[] args) {
        String ageInput = "twenty";
        try {
            int age = Integer.parseInt(ageInput);
            System.out.println("User age is: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid age entered.");
        } finally {
            System.out.println("Age parsing attempt completed.");
        }
    }
}

