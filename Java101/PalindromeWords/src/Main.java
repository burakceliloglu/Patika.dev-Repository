import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = scanner.next();


        if(isPalindrome(word)) {
            System.out.println("Palindrome.");
        }
        else {
            System.out.println("Not a palindrome.");
        }
    }

    static boolean isPalindrome(String word){
        int i=0;
        int j=word.length()-1;
        while(i <= j){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}