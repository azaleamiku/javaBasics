import java.util.Scanner;

public class VarInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your Age: ");
        String age = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scanner.close();
        
    }
}