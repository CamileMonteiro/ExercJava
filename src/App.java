
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        int option = 0;

        while (option != 3) { 
            System.out.println("\n-------- MENU --------");
            System.out.println("1 - Add Contact");
            System.out.println("2 - My Contacts");
            System.out.println("3 - Leave\n");
            System.out.print("Choose an option: ");

            try {
                option = sc.nextInt();
                sc.nextLine(); // Consome o caractere de nova linha

                switch (option) {
                    case 1:
                        System.out.println("Name for contact: ");
                        String name = sc.nextLine();
                        System.out.println("Phone Number for contact: ");
                        String phone = sc.nextLine();
                        manager.addContact(name, phone);
                        break;
                    case 2:
                        manager.listContacts();
                        break;
                    case 3:
                        System.out.println("leaving the program, bye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
                option = -1;
            } 

        }
        sc.close();
    }
}
