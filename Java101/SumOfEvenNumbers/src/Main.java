import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k,total=0;

        do{
            System.out.print("Enter the number: ");
            k = scanner.nextInt();
            if(k%4==0){
                total += k;
            }
        } while (k%2==0);

        System.out.println(total);
    }
}
