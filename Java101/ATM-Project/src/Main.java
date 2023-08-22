import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count=1,balance=1500,procedure,amount;
        String userName,password;

        while(count<=3) {
            System.out.print("Enter your user name: ");
            userName = scanner.nextLine();

            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (userName.equals("Burak") && password.equals("12345")) {
                System.out.println("Successful login.\n");
                do{
                    System.out.println("1-Deposit money\n2-Withdraw money\n3-Balance inquiry\n4-Exit");
                    System.out.print("Enter the number of the procedure: ");
                    procedure = scanner.nextInt();
                    switch (procedure) {
                        case 1:
                            System.out.print("Enter the amount: ");
                            amount = scanner.nextInt();
                            balance += amount;
                            break;
                        case 2:
                            System.out.print("Enter the amount: ");
                            amount = scanner.nextInt();
                            if (amount > balance) {
                                System.out.println("Amount is bigger than balance.");
                            } else {
                                balance -= amount;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid input.");
                            break;
                    }
                    System.out.println();
                }while(procedure!=4);
            }
            else{
                System.out.println("Unsuccessful.");
                if (count > 2) {
                    System.out.println("Your account is blocked.");
                    break;
                }
            }
            count++;
        }
    }
}
