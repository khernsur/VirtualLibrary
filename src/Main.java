import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VirtualLibrary library = VirtualLibrary.getInstance();
        Scanner scan = new Scanner(System.in);

        int choice = 0;

        while(choice != 4){
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a book");
            System.out.println("2. View books");
            System.out.println("3. Remove a book");
            System.out.println("4. Quit");
            System.out.print("Your choice: ");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    library.addBook();
                    break;

                case 2:
                    library.viewBook();
                    break;

                case 3:
                    library.removeBook();

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
        scan.close();
    }
}