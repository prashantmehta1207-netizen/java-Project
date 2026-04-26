import java.util.Scanner;

public class Calculator {

    // Function for addition
    static int add(int a, int b) {
        return a + b;
    }

    // Function for subtraction
    static int sub(int a, int b) {
        return a - b;
    }

    // Function for multiplication
    static int mul(int a, int b) {
        return a * b;
    }

    // Function for division
    static double div(int a, int b) {
        return (double) a / b;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, choice;

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + add(a, b));
                break;

            case 2:
                System.out.println("Result = " + sub(a, b));
                break;

            case 3:
                System.out.println("Result = " + mul(a, b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Result = " + div(a, b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

// output
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// Enter your choice: 1
// Enter first number: 4
// Enter second number: 5
// Result = 9
