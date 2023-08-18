import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*   ARMSTRONG NUMBER
        int number,counter=1,realValue,total = 0;

        System.out.print("Enter the number: ");
        number = scanner.nextInt();
        realValue = number;

        while(number!=9){
            number = number/10;
            counter++;
        }

        System.out.println(counter);

        while(realValue!=0){
            total += Math.pow((realValue % 10),counter);
            realValue /= 10;
        }

        System.out.println(total);

        if(realValue==total) System.out.println("Armstrong number.");
        else System.out.println("Not an armstrong number.");
         */

        /* SUM OF DIGITS */
        int number,counter=1,lastDigitSum = 0;
        System.out.print("Enter the number: ");
        number = scanner.nextInt();

        while(number!=0){
            lastDigitSum+=number%10;
            number/=10;
            counter++;
        }

        System.out.println(lastDigitSum);
    }
}
