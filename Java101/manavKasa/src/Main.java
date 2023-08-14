/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/

import java.util.Scanner;

public class Main {
    static float ARMUT_KG_FIYATI = 2.14f;
    static float ELMA_KG_FIYATI = 3.67f;
    static float DOMATES_KG_FIYATI = 1.11f;
    static float MUZ_KG_FIYATI = 0.95f;
    static float PATLICAN_KG_FIYATI = 5.00f;

    public static void main(String[] args) {
        float armutKg,elmaKg,domatesKg,muzKg,patlıcanKg,toplam;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armurttan kaç kg: ");
        armutKg = scanner.nextFloat();

        System.out.print("Elmadan kaç kg: ");
        elmaKg = scanner.nextFloat();

        System.out.print("Domatesten kaç kg: ");
        domatesKg = scanner.nextFloat();

        System.out.print("Muzdan kaç kg: ");
        muzKg = scanner.nextFloat();

        System.out.print("Patlıcandan kaç kg: ");
        patlıcanKg = scanner.nextFloat();

        toplam = ARMUT_KG_FIYATI * armutKg + ELMA_KG_FIYATI * elmaKg + DOMATES_KG_FIYATI * domatesKg + MUZ_KG_FIYATI * muzKg
                + patlıcanKg * PATLICAN_KG_FIYATI;

        System.out.println("Toplam ücret: " + toplam);
    }
}
