import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodCal {

    public static void main(String[] args) {
        sayHello();
        askQ();
    }

    static void sayHello() {
        System.out.println("Welcome to the Calculator");
    }

    static void askQ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to use the Calculator? [y]/[n]");
        String uAns = scanner.nextLine();

        if (uAns.equalsIgnoreCase("y")) {
            while (true) {
                int x = 0;
                while (true) {
                    System.out.print("Give me your first number: ");
                    try {
                        x = scanner.nextInt();
                        scanner.nextLine(); 
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid number. Please try again.");
                        scanner.nextLine(); 
                    }
                }

                System.out.print("What is the operation? [+, -, *, /]: ");
                String op = scanner.nextLine().trim();

                int z = 0;
                while (true) {
                    System.out.print("Give me your second number: ");
                    try {
                        z = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid number. Please try again.");
                        scanner.nextLine();
                    }
                }

                switch (op) {
                    case "+" -> System.out.println("Result: " + (x + z));
                    case "-" -> System.out.println("Result: " + (x - z));
                    case "*" -> System.out.println("Result: " + (x * z));
                    case "/" -> {
                        if (z == 0) {
                            System.out.println("Cannot divide by zero.");
                        } else {
                            System.out.println("Result: " + (x / z));
                        }
                    }
                    default -> {
                        System.out.println("Invalid operation.");
                        continue;
                    }
                }

                System.out.print("Do you still want to calculate? [y/n]: ");
                String again = scanner.nextLine();
                if (again.equalsIgnoreCase("n")) {
                    System.out.println("Exiting...");
                    break;
                } else if (!again.equalsIgnoreCase("y")) {
                    System.out.println("Invalid input. Exiting...");
                    break;
                }
            }
        } else {
            System.out.println("Alright. Exiting...");
        }

        scanner.close();
    }
}
