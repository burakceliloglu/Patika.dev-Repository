import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total=0;

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        for(int i=1; i<=number/2; i++){
            if(number%i==0){
                total += i;
            }
        }

        if(total == number){
            System.out.println("Number is perfect.");
        }
        else{
            System.out.println("Number isn't perfect.");
        }
    }
}
