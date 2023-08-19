import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        Scanner scanner = new Scanner(System.in);

        int number,guessing,counter=1;
        number = numberGenerator.nextInt(0,101);

        do{
            System.out.print("Enter the number between 1-100: ");
            guessing = scanner.nextInt();
            if(guessing>100 || guessing<0){
                System.out.println("Enter number between 1 and 100.");
                continue;
            }
            else if(guessing>number){
                System.out.println("The number you are looking for is smaller.");
            }
            else if(guessing==number){
                System.out.println("You are correct.");
                System.out.println("You find it in your " + counter + ". guess.");
                break;
            }
            else{
                System.out.println("The number you are looking for is bigger.");
            }
            counter++;
            if(counter>5){
                System.out.println("You have no more guess.");
                System.out.println("Try again.");
                break;
            }
        }while(guessing!=number);
    }
}