import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float birinci, ikinci, sonuc;
        String islem;

        System.out.print("Birinci değeri girin: ");
        birinci = scanner.nextFloat();

        System.out.print("İkinci değeri girin: ");
        ikinci = scanner.nextFloat();

        System.out.print("Yapmak istediğiniz işlemi(+,-,/,*,%) girin: ");
        islem = scanner.next();

        switch (islem){
            case "+":
                System.out.println(birinci+ikinci);
                break;
            case "-":
                System.out.println(birinci-ikinci);
                break;
            case "/":
                System.out.println(birinci/ikinci);
                break;
            case "*":
                System.out.println(birinci*ikinci);
                break;
            case "%":
                if(ikinci==0){
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                else System.out.println(birinci%ikinci);
                break;
            default:
                System.out.println("Geçersiz işlem.");
        }
    }
}
