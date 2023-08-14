import java.util.Scanner;

public class Main {
    static float PI = 3.1415F;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float r, alan, cevre;

        System.out.print("Yaricap(r) giriniz:" );
        r = scanner.nextFloat();

        alan = PI * r * r;
        cevre = 2 * PI * r;

        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);
    }
}

