import java.util.Scanner;

public class Test {

    public static void main(String[] args) { // main
        /**
         * @author burak celiloglu
         */
        System.out.println("Hellow world!"); // sout

        // KULLANICIDAN VERİ ALMAK
        int a;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        a = scanner.nextInt();

        System.out.println(a);
    }
}
