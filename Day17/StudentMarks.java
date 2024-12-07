import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        
        int[] marks = new int[subjects];
        int totalMarks = 0;

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        System.out.print("Enter the maximum marks for each subject: ");
        int maxMarks = scanner.nextInt();

        int maxTotalMarks = maxMarks * subjects;
        double average = (double) totalMarks / subjects;
        double percentage = ((double) totalMarks / maxTotalMarks) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");

    }
}
