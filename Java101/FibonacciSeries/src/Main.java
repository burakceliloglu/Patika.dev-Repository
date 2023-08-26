import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int a=0, b=1, c;
        System.out.print(a + ",");
        System.out.print(b + ",");
        for(int i=0; i<number-1; i++){
            c = a + b;
            System.out.print(c + ",");
            a = b;
            b = c;
        }
    }
}
