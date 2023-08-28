import java.util.Scanner;

public class Main {
    static void pattern(int number){
        if(number < 0){
            System.out.print(" " + number + " ");
            return;
        }

        System.out.print(" " + number + " ");
        pattern(number - 5);
        System.out.print(" " + number + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        pattern(number);
    }
}
