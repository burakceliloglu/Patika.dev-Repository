/*
Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c,cevre,alan,u;

        System.out.print("Birinci kenari gir: ");
        a = scanner.nextFloat();

        System.out.print("Ikinci kenari gir: ");
        b = scanner.nextFloat();

        System.out.print("Ucuncu kenari gir: ");
        c = scanner.nextFloat();

        u = (float) (a+b+c) / 2;
        cevre = (float) 2 * u;
        alan = (float) Math.sqrt(u * (u-a)* (u-b) * (u-c));

        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);
    }
}
