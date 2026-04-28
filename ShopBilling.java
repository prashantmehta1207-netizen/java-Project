import java.util.Scanner;

public class ShopBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double total = 0;

        while (true) {
            System.out.println("\n--- SHOP MENU ---");
            System.out.println("1. Item 1 (Price: 50)");
            System.out.println("2. Item 2 (Price: 100)");
            System.out.println("3. Item 3 (Price: 150)");
            System.out.println("4. Exit & Print Bill");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                total += 50;
                System.out.println("Item 1 added!");

            } else if (choice == 2) {
                total += 100;
                System.out.println("Item 2 added!");

            } else if (choice == 3) {
                total += 150;
                System.out.println("Item 3 added!");

            } else if (choice == 4) {
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        System.out.println("\n🧾 Total Bill = " + total);
        System.out.println("Thank you for shopping!");
    }
}
