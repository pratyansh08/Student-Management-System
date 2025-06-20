import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    static String studentName;

    public void studentMenu() {
        System.out.print("Enter your name: ");
        studentName = sc.next();
        System.out.println("1. View Courses");
        System.out.println("2. Take Exam");
        System.out.println("3. View Result");
        System.out.println("4. Back");

        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> Course.viewCourses();
            case 2 -> Exam.startExam(studentName);
            case 3 -> Result.viewResult(studentName);
            case 4 -> {}
            default -> System.out.println("Invalid");
        }
    }

    public static void studentLogin() {
        Student s = new Student();
        s.studentMenu();
    }
}
