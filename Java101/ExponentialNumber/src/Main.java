import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expo,base,result=1;

        System.out.print("Enter the base: ");
        base = scanner.nextInt();

        System.out.print("Enter the exponential: ");
        expo = scanner.nextInt();

        for(int i=1; i<=expo; i++){
            result *= base;
        }

        System.out.println(result);
    }
}
