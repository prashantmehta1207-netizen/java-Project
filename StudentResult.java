import java.util.Scanner;

public class StudentResult {
    public static double calculatePercentage(int total, int subject) {
        return (double) total / subject;
    }

    public static String getgrade(double percentage) {
        if (percentage >= 90) {
            return "Grade: A";
        } else if (percentage >= 80) {
            return "Grade: B";
        } else if (percentage >= 70) {
            return "Grade: C";
        } else if (percentage >= 60) {
            return "Grade: D";
        } else {
            return "Grade: F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject, total = 0;
        System.out.println("Enter the number of subjects:");
        subject = sc.nextInt();

        int marks[] = new int[subject];
        for (int i = 0; i < subject; i++) {
            System.out.println("Enter the total marks for subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double percentage = calculatePercentage(total, subject);
        String grade = getgrade(percentage);

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

// output
// Enter the number of subjects:
// 3
// Enter the total marks for subject 1:
// 55
// Enter the total marks for subject 2:
// 88
// Enter the total marks for subject 3:
// 89
// Total Marks: 232
// Percentage: 77.33333333333333%
// Grade: Grade: C
