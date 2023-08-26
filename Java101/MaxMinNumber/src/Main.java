import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,number;

        System.out.print("Enter the number of numbers: ");
        n = scanner.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print(i + 1 + ". number: ");
            number = scanner.nextInt();
            array[i] = number;
        }
        System.out.println("Numbers: " + Arrays.toString(array));

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int cursor: array){
            if(cursor>max){
                max = cursor;
            }
            if(cursor<min){
                min = cursor;
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
