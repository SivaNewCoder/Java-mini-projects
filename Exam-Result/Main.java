import java.util.Scanner;

public class Main {

    static String studentName(Scanner mark) {
        System.out.println("===== Exam Result =====");
        System.out.println("");
        System.out.println("Enter your name:");
        String name = mark.nextLine();
        return name;
    }

    static int[] allMarks(Scanner mark) {
        int[] marks = new int[5];
        String[] subject = { "Tamil", "English", "Maths", "Science", "Social" };

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter " + subject[i] + " Mark:");
            marks[i] = mark.nextInt();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid Mark!.");
                System.out.println("Enter " + subject[i] + " Mark Again");
                marks[i] = mark.nextInt();
            }
        }
        return marks;
    }

    static int calcTotal(int[] marks) {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    static float calcAverage(int total) {
        float average = total / 5.0f;
        return average;
    }

    static String calcResult(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                return "Fail";
            }
        }
        return "Pass";
    }

    static char calcGrade(float average, String result) {
        if (result.equals("Fail")) {
            return 'F';
        }
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else if (average >= 35) {
            return 'E';
        } else {
            return 'F';
        }
    }

    static void showResult(String name, int[] marks, int total, float average, String result, char grade) {
        String[] subject = { "Tamil", "English", "Maths", "Science", "Social" };

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name: " + name);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(subject[i] + ": " + marks[i]);
        }

        System.out.println("-------------------------");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Scanner mark = new Scanner(System.in);
        String name = studentName(mark);
        int[] marks = allMarks(mark);
        int total = calcTotal(marks);
        float average = calcAverage(total);
        String result = calcResult(marks);
        char grade = calcGrade(average, result);
        showResult(name, marks, total, average, result, grade);

        mark.close();

    }
}