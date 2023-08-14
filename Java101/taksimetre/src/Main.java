/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/

import java.util.Scanner;

public class Main {

    static float KM_FIYATI = 2.20F;

    public static void main(String[] args) {
        float km,odenecekTutar = 10F;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kac km gittin: ");
        km = scanner.nextFloat();

        odenecekTutar += (km * KM_FIYATI);

        odenecekTutar = (odenecekTutar<20) ? 20 : odenecekTutar;

        System.out.println("Odeyecegin tutar: " + odenecekTutar);
    }
}
