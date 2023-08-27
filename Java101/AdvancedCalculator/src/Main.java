import java.util.Scanner;

public class Main {
    static void plus(){
        Scanner scanner = new Scanner(System.in);
        int i=1, number, result=0;
        while(true){
            System.out.print(i++ + ". number: ");
            number = scanner.nextInt();
            if(number==0){
                break;
            }
            result += number;
        }

        System.out.println("Result: " + result);
    }

    static void minus(){
        Scanner scanner = new Scanner(System.in);
        int i=1, number, result=0;
        System.out.print("How many numbers will you give: ");
        int numbers = scanner.nextInt();
        while(i<=numbers){
            System.out.print(i + ". number: ");
            number = scanner.nextInt();
            if(i==1){
                result =number;
                i++;
                continue;
            }
            result -= number;
            i++;
        }
        System.out.println(result);
    }

    static void multiplication(){
        Scanner scanner = new Scanner(System.in);
        int i=1, number, result=1;
        while(true){
            System.out.print(i++ + ". number: ");
            number = scanner.nextInt();
            if(number==0){
                result = 0;
                break;
            }
            if(number == 1){
                break;
            }
            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void division(){
        Scanner scanner = new Scanner(System.in);
        double number, result=0;
        System.out.print("How many numbers will you give: ");
        int numbers = scanner.nextInt();

        for(int i=1; i<=numbers; i++){
            System.out.print(i + ". number: ");
            number = scanner.nextDouble();
            if(number==0){
                System.out.println("You cannot enter the divisor 0.");
            }
            if(i==1){
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println(result);
    }

    static void exponent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the expo: ");
        int expo = scanner.nextInt();

        int result = 1;
        for(int i=1; i<=expo; i++){
            result *= base;
        }

        System.out.println(base + "^" + expo + " = " + result);
    }

    static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        for(int i=1; i<=number; i++){
            factorial *= i;
        }

        System.out.print(number + "! = "+ factorial);
    }

    static void mode(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int result = number % divisor;

        System.out.println(number + " % " + divisor + " = " + result);
    }

    static void rectangular(){
        Scanner scanner = new Scanner(System.in);
        double shortSide, longSide;
        System.out.print("Enter the short side of the rectangular: ");
        shortSide = scanner.nextDouble();
        System.out.print("Enter the long side of the rectangular: ");
        longSide = scanner.nextDouble();

        System.out.println("Perimeter = " + 2*(longSide+shortSide));
        System.out.println("Area = " + longSide*shortSide);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("====================\n1-Addition\n2-Extraction\n3-Multiplication\n4-Division"+
                "\n5-Exponent Calculation\n6-Factorial\n7-Mode\n8-Rectangle Area and Perimeter Calculation");
        System.out.print("\n====================\nEnter the number of the operation: ");
        int number = scanner.nextInt();
        System.out.println("====================");

        switch(number){
            case 1:
                plus();
                break;
            case 2:
                minus();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                exponent();
                break;
            case 6:
                factorial();
                break;
            case 7:
                mode();
                break;
            case 8:
                rectangular();
                break;
            default:
                System.out.println("Invalid Number!");
                break;
        }
    }
}
