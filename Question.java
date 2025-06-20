import java.util.*;

public class Question {
    static Map<String, List<String[]>> questionBank = new HashMap<>();

    public static void addQuestion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String course = sc.nextLine();
        System.out.print("Enter question: ");
        String question = sc.nextLine();
        System.out.print("Option A: ");
        String a = sc.nextLine();
        System.out.print("Option B: ");
        String b = sc.nextLine();
        System.out.print("Option C: ");
        String c = sc.nextLine();
        System.out.print("Option D: ");
        String d = sc.nextLine();
        System.out.print("Correct option (A/B/C/D): ");
        String ans = sc.nextLine();

        String[] newQ = { question, a, b, c, d, ans };

        questionBank.putIfAbsent(course, new ArrayList<>());
        questionBank.get(course).add(newQ);

        System.out.println("Question added successfully.");
    }

    public static void addDefaultQuestions() {
        String course = "Java";

        String[] q1 = {
                "What is JVM?",
                "Java Virtual Machine",
                "Java Variable Method",
                "Java Virtual Method",
                "Java Verified Machine",
                "A"
        };
        String[] q2 = {
                "Which keyword is used to inherit a class in Java?",
                "this",
                "import",
                "extends",
                "implements",
                "C"
        };
        String[] q3 = {
                "Which of the following is not a Java feature?",
                "Object-Oriented",
                "Use of pointers",
                "Portable",
                "Dynamic and Extensible",
                "B"
        };
        String[] q4 = {
                "Which method is the entry point of a Java program?",
                "main()",
                "start()",
                "run()",
                "init()",
                "A"
        };
        String[] q5 = {
                "Which data type is used to store text in Java?",
                "string",
                "String",
                "Txt",
                "Char",
                "B"
        };

        questionBank.putIfAbsent(course, new ArrayList<>());
        questionBank.get(course).addAll(Arrays.asList(q1, q2, q3, q4, q5));

        System.out.println("Default questions added for course: " + course);
    }
}
