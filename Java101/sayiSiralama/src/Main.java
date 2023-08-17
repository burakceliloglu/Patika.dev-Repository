import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float first,second,third;

        System.out.print("Enter the first number: ");
        first = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        second = scanner.nextFloat();

        System.out.print("Enter the third number: ");
        third = scanner.nextFloat();

        if(first>second && first>third){
            if(second>third){
                System.out.println(first + ">" + second + ">" + third);
            }
            else System.out.println(first + ">" + third + ">" + second);
        }
        if(second>first && second>third){
            if(first>third){
                System.out.println(second + ">" + first + ">" + third);
            }
            else System.out.println(second + ">" + third + ">" + first);
        }
        if(third>first && third>second){
            if(first>second){
                System.out.println(third + ">" + first + ">" + second);
            }
            else System.out.println(third + ">" + second + ">" + first);
        }
    }
}
