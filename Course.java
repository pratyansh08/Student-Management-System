import java.util.*;

public class Course {
    static List<String> courseList = new ArrayList<>();

    public static void addCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();
        courseList.add(course);
        System.out.println("Course Added.");
    }

    public static void viewCourses() {
        System.out.println("Available Courses:");
        for (String c : courseList) {
            System.out.println("- " + c);
        }
    }
}
