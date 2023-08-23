import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1,number2,gcd=1,lcm;

        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();

        int min = Math.min(number1, number2);
        int i=1;
        while(i<=min){
            if(number1%i==0 && number2%i==0){
                gcd = i;
            }
            i++;
        }

        lcm = (number2*number1) / gcd;

        System.out.println();

        System.out.println("Greatest Common Divisor: " + gcd);
        System.out.println("Least Common Multiple: " + lcm);
    }
}
