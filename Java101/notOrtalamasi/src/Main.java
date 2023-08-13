/*
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,muzik,tarih;
        float ortalama;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        matematik = scanner.nextInt();

        System.out.print("Fizik notu: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notu: ");
        kimya = scanner.nextInt();

        System.out.print("Turkce notu: ");
        turkce = scanner.nextInt();

        System.out.print("Müzik notu: ");
        muzik = scanner.nextInt();

        System.out.print("Tarih notu: ");
        tarih = scanner.nextInt();

        ortalama = (float) (matematik+fizik+kimya+turkce+tarih+muzik) / 6;
        System.out.println("Ortalama: " + ortalama);

        String passedOrNot = (ortalama > 60) ? "Sınıfı geçti" : "Sınıfta kaldı" ;
        System.out.println(passedOrNot);
    }
}
