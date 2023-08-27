import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int number){
        int temp = number, reverseNumber=0, lastNumber;
        while(temp!=0){
            lastNumber = temp%10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp /= 10;
        }

        if(reverseNumber == number) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if(isPalindrome(number)) {
            System.out.println("Palindrome.");
        }
        else{
            System.out.println("Isn't palindrome.");
        }
    }
}
