import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float km,total;
        int age,flightType;
        boolean isNull;

        do{
            System.out.print("Enter the distance(km): ");
            km = scanner.nextFloat();

        }while(km<=0);

        do{
            System.out.print("Enter your age(bigger than zero): ");
            age = scanner.nextInt();

        }while(age<=0);

        do{
            System.out.print("Enter the flight type(1 => One Way , 2 => Round Trip ): ");
            flightType = scanner.nextInt();

        }while(flightType!=1 && flightType!=2);

        total = (float) (km * 0.1);

        if(age < 12){
            total -= total/2;
        }
        else if(age<=24){
            total -= total * 0.1;
        }
        else if(age>65){
            total -= total * 0.3;
        }

        if(flightType == 2){
            total -= total * 0.2;
            total *= 2;
        }

        System.out.println("Your total: " + total);
    }
}
