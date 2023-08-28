import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] list = new int[n];

        int number;
        for(int i=0; i<n; i++){
            System.out.print("Enter the " + i + ". index: ");
            number = scanner.nextInt();
            list[i] = number;
        }
        System.out.println(Arrays.toString(list));

        int temp;
        for(int j=0; j<n; j++){
            for(int k=0; k<n; k++){
                if(j!=k && list[j]<list[k]){
                    temp = list[k];
                    list[k] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
