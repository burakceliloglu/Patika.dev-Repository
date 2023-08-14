/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float fiyat, kdvliFiyat, kdvTutari;
        float kdvOrani;

        System.out.print("Enter a price: ");
        fiyat = scanner.nextFloat();

        kdvOrani = (fiyat > 1000) ? 0.08F : 0.18F;
        kdvTutari = kdvOrani * fiyat;
        kdvliFiyat = kdvTutari + fiyat;

        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li fiyatı: " + kdvliFiyat);
    }
}
