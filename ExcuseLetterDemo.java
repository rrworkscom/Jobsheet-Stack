import java.util.Scanner;

public class ExcuseLetterDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ExcuseLetterStack20 stack = new ExcuseLetterStack20(5);

        int choice;
        
        do {
            System.out.println("\nMENU");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search Letter by Name");
            System.out.print("Choose menu: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class: ");
                    String className = scan.nextLine();
                    System.out.print("Type (S=Sick / I=Other): ");
                    char type = scan.next().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = scan.nextInt();
                    ExcuseLetter20 exc = new ExcuseLetter20(id, name, className, type, duration);
                    stack.push(exc);
                    break;
                case 2:
                    ExcuseLetter20 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing letter from " + processed.name);
                    }
                    break;
                case 3:
                    ExcuseLetter20 view = stack.peek();
                    if (view != null) {
                        System.out.println("The latest excuse letter is from " + view.name);
                    }
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    String search = scan.nextLine();
                    stack.searchByName(search);
                    break;
                default:
                    System.out.println("Invalid choice.");        
            }
        } while (choice >= 1 && choice <= 5);
    }
}
