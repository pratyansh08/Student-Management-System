import java.util.Scanner;

public class Admin {
    static Scanner sc = new Scanner(System.in); // Make it static if used in static method

    public static void adminLogin() {
        System.out.println("Admin Menu:");
        System.out.println("1. Add Course");
        System.out.println("2. Add Question");
        System.out.println("3. View Results");
        System.out.println("4. Back");

        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> Course.addCourse();
            case 2 -> Question.addQuestion();
            case 3 -> Result.viewAllResults();
            case 4 -> {}
            default -> System.out.println("Invalid");
        }
    }
}
