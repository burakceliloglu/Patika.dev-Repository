import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        for(int j=0; j<number; j++){
            for(int i=number-j; i>=1 ;i--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
