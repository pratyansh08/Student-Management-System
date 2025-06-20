import java.util.*;

public class Result {
    static Map<String, String> studentResults = new HashMap<>();

    public static void storeResult(String name, String course, int score, int total) {
        studentResults.put(name, "Course: " + course + ", Score: " + score + "/" + total);
        System.out.println("Exam Submitted.");
    }

    public static void viewResult(String name) {
        String result = studentResults.get(name);
        System.out.println(result != null ? result : "No result found.");
    }

    public static void viewAllResults() {
        if (studentResults.isEmpty()) {
            System.out.println("No results to show.");
            return;
        }
        studentResults.forEach((name, res) -> System.out.println(name + " => " + res));
    }
}
