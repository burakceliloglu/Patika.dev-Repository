import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] list = new int[n];
        int[] duplicate = new int[n];

        int number;
        for(int i=0; i<n; i++){
            System.out.print("Enter the " + i + ". index: ");
            number = scanner.nextInt();
            list[i] = number;
        }
        System.out.println(Arrays.toString(list));

        int index=0;
        for(int j=0; j<n; j++){
            for(int k=0; k<n; k++){
                if(j!=k && list[j]==list[k] && list[j]%2==0){
                    if(!isFind(duplicate,list[j])){
                        duplicate[index++] = list[j];
                    }
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(duplicate));
    }

    private static boolean isFind(int[] array, int value) {
        for(int i: array){
            if(i == value){
                return true;
            }
        }
        return false;
    }
}
