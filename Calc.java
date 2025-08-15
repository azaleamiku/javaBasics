import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your first number: ");
            int n1 = scanner.nextInt();
            System.out.print("Enter your second number: ");
            int n2 = scanner.nextInt();
            scanner.nextLine(); // clear the newline

            System.out.print("Operation (+, -, *, /): ");
            String op = scanner.nextLine();

            if (op.equals("+")) {
                System.out.println("Result: " + (n1 + n2));
            } else if (op.equals("-")) {
                System.out.println("Result: " + (n1 - n2));
            } else if (op.equals("*")) {
                System.out.println("Result: " + (n1 * n2));
            } else if (op.equals("/")) {
                if (n2 != 0) {
                    System.out.println("Result: " + (n1 / n2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
            } else {
                System.out.println("Invalid operation.");
                continue; // Ask again
            }

            System.out.print("Do you still want to calculate? [y/n]: ");
            String again = scanner.nextLine();

            if (again.equalsIgnoreCase("n")) {
                break; // exit the loop
            } else if (again.equalsIgnoreCase("y")) {
                continue;
            } else {
                System.out.println("Invalid input. Exiting...");
                break;
            }
        }

        scanner.close();
    }
}
