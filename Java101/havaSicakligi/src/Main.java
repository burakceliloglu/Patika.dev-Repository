import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heat;

        System.out.print("Enter temperature: ");
        heat = scanner.nextInt();

        if(heat<5){
            System.out.println("You can go to ski.");
        }

        if(heat>=5 && heat<=15) {
                System.out.println("You can go to the cinema.");
        }

        if(heat>=15 && heat<=25) {
            System.out.println("You can go to the picnic.");
        }

        if(heat>25){
            System.out.println("You can go to swimming.");
        }
    }
}
