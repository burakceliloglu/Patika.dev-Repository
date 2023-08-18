import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.print("Enter the year: ");
        year = scanner.nextInt();

        if(year%4==0) System.out.println("Leap year.");
        else if(year%400==0) System.out.println("Leap year.");
        else if(year%100==0) System.out.println("Not a leap year.");
        else System.out.println("Not a leap year");
    }
}
