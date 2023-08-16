import javax.sound.midi.Soundbank;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullaniciIsmi, sifre, cevap, yeniSifre;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı ismini giriniz: ");
        kullaniciIsmi = scanner.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        sifre = scanner.nextLine();

        if(kullaniciIsmi.equals("Admin") && sifre.equals("12345")){
            System.out.println("Başarılı giriş.");
        }
        else{
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz? (Evet/Hayır): ");
            cevap = scanner.nextLine();
            if(cevap.equals("Evet")){
                System.out.print("Yeni şifrenizi giriniz: ");
                yeniSifre = scanner.nextLine();

                if(yeniSifre.equals("12345")) {
                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else if(cevap.equals("Hayır")){
                System.out.println("Sen bilirsin.");
            }
            else System.out.println("Geçerli bir kelime giriniz.");
        }
    }
}
