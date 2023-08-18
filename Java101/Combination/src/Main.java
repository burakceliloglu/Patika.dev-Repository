import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n,r,n_factorial=1,r_factorial=1,nr_factorial=1;

        System.out.print("A set with n elements: ");
        n = scanner.nextInt();

        System.out.print("Different groups with r elements: ");
        r = scanner.nextInt();

        for(int i=1; i<=n; i++){
            n_factorial *= i;
        }

        for(int j=1; j<=r; j++){
            r_factorial *= j;
        }

        for(int l=1; l<=n-r; l++){
            nr_factorial *= l;
        }

        System.out.println(n_factorial/(r_factorial*nr_factorial));
    }
}
