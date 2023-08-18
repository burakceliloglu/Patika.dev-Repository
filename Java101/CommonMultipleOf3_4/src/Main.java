import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k,counter=0;
        float total=0F;

        System.out.print("Enter the number: ");
        k = scanner.nextInt();

        for(int i=1; i<=k; i++){
            if(i%4==0 && i%3==0){
                total += i;
                counter++;
            }
        }
        total = total/counter;

        System.out.println(total);
    }
}
