import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "prashant";
        String correctpassword = "Mehta";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctpassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts--;
                System.out.println("Wrong credentials!");
                System.out.println("Incorrect username or password. Attempts left: " + attempts);
            }
        }
        if (attempts == 0) {
            System.out.println("Account Locked!.");
        }

    }

}

// output:

// Enter username: prashant
// Enter password: Mehta
// Login successful!
// Enter username: prashant
// Enter password: 1234
// Wrong credentials!
// Incorrect username or password. Attempts left: 2
  
