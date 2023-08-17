import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float mat,turkce,kimya,fizik,muzik,ortalama,total=0;
        int counter=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = scanner.nextFloat();
        if(mat >= 0 && mat <= 100){
            counter++;
            total += mat;
        }

        System.out.print("Türkçe notunu giriniz: ");
        turkce = scanner.nextFloat();
        if(turkce >= 0 && turkce <= 100){
            counter++;
            total += turkce;
        }

        System.out.print("Fizik notunu giriniz: ");
        fizik = scanner.nextFloat();
        if(fizik >= 0 && fizik <= 100){
            counter++;
            total += fizik;
        }

        System.out.print("Kimya notunu giriniz: ");
        kimya = scanner.nextFloat();
        if(kimya >= 0 && kimya <= 100){
            counter++;
            total += kimya;
        }

        System.out.print("Müzik notunu giriniz: ");
        muzik = scanner.nextFloat();
        if(muzik >= 0 && muzik <= 100){
            counter++;
            total += muzik;
        }

        ortalama = total / counter;

        if(ortalama<=55){
            System.out.println("Sınıfta kaldınız.");
        }
        else System.out.println("Sınıfı geçtiniz.");

        System.out.println(ortalama);
    }
}
