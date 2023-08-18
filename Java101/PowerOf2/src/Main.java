import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k,powerFour=1,powerFive=1;

        System.out.print("Enter the number: ");
        k = scanner.nextInt();

        while(powerFive<k || powerFour<k){
            if(powerFour<k){
                System.out.println("Power of four: " + powerFour);
                powerFour *= 4;
            }
            if(powerFive<k){
                System.out.println("Power of five: " +powerFive);
                powerFive *= 5;
            }

        }
    }
}
