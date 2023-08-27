import java.util.Scanner;

public class Main {
    static int power(int base, int expo){
        if(expo==0) return 1;
        if(expo==1) return base;
        return base*power(base,expo-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the expo: ");
        int expo = scanner.nextInt();

        int result = power(base,expo);

        System.out.println(base + "^" + expo + " = " + result);
    }
}
