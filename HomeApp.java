import java.util.Scanner;
public class HomeApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HomeInterface homeInterface = new HomeInterface();

        while (true) {
            System.out.println("1. Turn On all");
            System.out.println("2. Turn Off all");
            System.out.println("3. Exit");
            System.out.print("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    homeInterface.turnOnAll();
                    break;
                case 2:
                    homeInterface.turnOffAll();;
                    break;
                case 3:
                    System.out.println("Exit.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
    }
}

