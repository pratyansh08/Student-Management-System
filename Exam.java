import java.util.*;

public class Exam {
    static Scanner sc = new Scanner(System.in);

    public static void startExam(String studentName) {
        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();

        List<String[]> questions = Question.questionBank.get(courseName);

        if (questions == null || questions.isEmpty()) {
            System.out.println("No questions found for this course.");
            return;
        }

        int score = 0;

        for (String[] q : questions) {
            System.out.println("\n" + q[0]); // Question
            System.out.println("A. " + q[1]);
            System.out.println("B. " + q[2]);
            System.out.println("C. " + q[3]);
            System.out.println("D. " + q[4]);
            System.out.print("Enter your answer (A/B/C/D): ");
            String ans = sc.next().toUpperCase();

            if (ans.equalsIgnoreCase(q[5])) {
                score++;
            }
        }

        Result.storeResult(studentName, courseName, score, questions.size());
        System.out.println("Exam Completed! Your score: " + score + "/" + questions.size());
    }
}
