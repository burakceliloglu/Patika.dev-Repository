/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float boy, kilo, indeks;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu(metre) girin: ");
        boy = scanner.nextFloat();

        System.out.print("Kilonuzu(kilogram) girin: ");
        kilo = scanner.nextFloat();

        indeks = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksin: " + indeks);
    }
}
