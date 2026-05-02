
import java.util.Scanner;

public class StudentDemo20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StudentAssignmentStack20 stack = new StudentAssignmentStack20(5);

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Assignments");
            System.out.println("2. Grade Assignments");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignment");
            System.out.println("5. View First Assignment");
            System.out.print("Choose menu: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class: ");
                    String className = scan.nextLine();
                    Student20 std = new Student20(nim, name, className);
                    stack.push(std);
                    System.out.printf("%s's Assignment has been successfully submitted!\n", std.name);
                    break;
                case 2:
                    Student20 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Enter grade (0-100): ");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", graded.name, grade);
                    }
                    break;
                case 3:
                    Student20 view = stack.peek();
                    if (view != null) {
                        System.out.println("The last assignment submitted by " + view.name);
                    }
                    break;
                case 4:
                    System.out.println("List of all assignments");
                    System.out.println("Name\tNIM\tClass");
                    stack.print();
                    System.out.println("Total assignments in stack: " + stack.count());
                    break;
                case 5:
                    Student20 first = stack.peekBottom();
                    if (first != null) {
                        System.out.println("First assignment submitted by " + first.name);
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice >= 1 && choice <= 5);
    }
}
