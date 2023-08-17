import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month,day;
        String sign="";

        System.out.print("Enter the month(1-12): ");
        month = scanner.nextInt();

        System.out.print("Enter the day(1-31): ");
        day = scanner.nextInt();

        switch (month){
            case 1:
                if(day>=1 && day<22){
                    sign="Capricorn.";
                }
                else if(day>=22 && day <=31){
                    sign="Aquarius.";
                }
                break;
            case 2:
                if(day>=1 && day<=19){
                    sign="Aquarius.";;
                }
                else if(day>19 && day <=29){
                    sign="Pisces.";
                }
            case 3:
                if(day>=1 && day<=20){
                    sign="Pisces.";
                }
                else if(day>20 && day<=31){
                    sign="Aries.";
                }
            case 4:
                if(day>=1 && day<=20){
                    sign="Aries.";
                }
                else if(day>20 && day<=31){
                    sign="Taurus.";
                }
                break;
            case 5:
                if(day>=1 && day<=21){
                    sign="Taurus.";
                }
                else if(day>21 && day<=31){
                    sign="Gemini.";
                }
                break;
            case 6:
                if(day>=1 && day<=22){
                    sign="Gemini.";
                }
                else if(day>22 && day<=31){
                    sign="Cancer.";
                }
                break;
            case 7:
                if(day>=1 && day<=22){
                    sign="Cancer.";
                }
                else if(day>22 && day<=31){
                    sign="Leo.";
                }
                break;
            case 8:
                if(day>=1 && day<23){
                    sign="Leo.";
                }
                else if(day>=23 && day<=31){
                    sign="Virgo.";
                }
                break;
            case 9:
                if(day>=1 && day<=22){
                    sign="Virgo.";
                }
                else if(day>22 && day<=31){
                    sign="Libra.";
                }
                break;
            case 10:
                if(day>=1 && day<=22){
                    sign="Libra.";
                }
                else if(day>22 && day<=31){
                    sign="Scorpio.";
                }
                break;
            case 11:
                if(day>=1 && day<=21){
                    sign="Scorpio.";
                }
                else if(day>21 && day<=31){
                    sign="Sagittarius.";
                }
                break;
            case 12:
                if(day>=1 && day<=21){
                    sign="Sagittarius.";
                }
                else if(day>21 && day<=31){
                    sign="Capricorn.";
                }
                break;
            default:
                System.out.print("Invalid month or day. Retry.");
        }

        System.out.println("Your sign is "+ sign);
    }
}
