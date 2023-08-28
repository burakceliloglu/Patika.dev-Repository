import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = {10,20,20,10,10,20,5,20};
        Arrays.sort(list);
        int counter=1;

        for(int i=0; i<list.length; i++){
            while(i+1< list.length && list[i]==list[i+1]){
                i++;
                counter++;
            }
            System.out.println(list[i]+ "'s frequency: " + counter);
            counter=1;
        }
    }
}
