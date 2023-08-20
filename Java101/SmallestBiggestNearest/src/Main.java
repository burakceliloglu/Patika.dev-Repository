import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("Enter the number: ");
        number = scanner.nextInt();

        int[] array = {1,67,34,89,54,12};

        Arrays.sort(array);

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        for(int i: array){
            if(i<number && i>minValue){
                minValue = i;
            }
            if(i>number && i<maxValue){
                maxValue = i;
            }
        }
        System.out.println(maxValue + " & " + minValue);
    }
}
