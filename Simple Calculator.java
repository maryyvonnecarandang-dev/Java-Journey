
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        sc.nextLine(); // Consume leftover newline

        System.out.print("Operation (add, subtract, multiply, divide, modulo): ");
        String operation = sc.nextLine();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int remainder = num1 % num2;

        if (operation.equalsIgnoreCase("add")) {
            System.out.println("Sum: " + sum);

        } else if (operation.equalsIgnoreCase("subtract")) {
            System.out.println("Difference: " + difference);

        } else if (operation.equalsIgnoreCase("multiply")) {
            System.out.println("Product: " + product);

        } else if (operation.equalsIgnoreCase("divide")) {
            if (num2 != 0) {
                double quotient = (double) num1 / num2;
                System.out.println("Quotient: " + quotient);
            } else {
                System.out.println("Cannot divide by zero!");
            }

        } else if (operation.equalsIgnoreCase("modulo")) {
            if (num2 != 0) {
                System.out.println("Remainder: " + remainder);
            } else {
                System.out.println("Cannot calculate modulo by zero!");
            }
        } else {
            System.out.println("Invalid operation!");
        }
        sc.close();
    }
}