import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Welcome to the PatikaStore! *****");
        boolean stayLogin = true;
        while(stayLogin){
            System.out.println("Product Management System\n1-Notebooks\n2-Cellphones" +
                    "\n3-List All Brands");
            System.out.print("Enter the action (Press 0 to exit): ");
            int selection = scanner.nextInt();
            switch (selection){
                case 0:
                    System.out.println("May we meet again.");
                    stayLogin = false;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid number!");
                    break;
            }

        }
    }
}
