import java.util.Scanner;

public class Main {
    static boolean isPrime(int number, int divisor){
        if(divisor==1){
            return true;
        }
        if(number%divisor==0){
            return false;
        }

        return isPrime(number,divisor-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if(isPrime(number,number/2)){
            System.out.println("Prime.");
        }
        else{
            System.out.println("Not prime.");
        }

    }
}
