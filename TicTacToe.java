import java.util.Scanner;

public class TicTacToe {

    static char board[][] = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' }
    };

    // Display board
    static void printBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2)
                System.out.println("--+---+--");
        }
    }

    // Check winner
    static boolean checkWin(char p) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p)
                return true;
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p)
                return true;
        }
        if (board[0][0] == p && board[1][1] == p && board[2][2] == p)
            return true;
        if (board[0][2] == p && board[1][1] == p && board[2][0] == p)
            return true;

        return false;
    }

    // ✅ Main method MUST be inside class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char player = 'X';

        for (int turn = 0; turn < 9; turn++) {

            printBoard();
            System.out.println("Player " + player + " turn");

            System.out.print("Enter row (0-2): ");
            int r = sc.nextInt();

            System.out.print("Enter column (0-2): ");
            int c = sc.nextInt();

            if (board[r][c] == ' ') {
                board[r][c] = player;

                if (checkWin(player)) {
                    printBoard();
                    System.out.println("🎉 Player " + player + " wins!");
                    return;
                }

                player = (player == 'X') ? 'O' : 'X';

            } else {
                System.out.println("Invalid move! Try again.");
                turn--;
            }
        }

        printBoard();
        System.out.println("It's a draw!");
    }
}
