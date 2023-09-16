import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Game {
    Player player;
    // Location location;
    private Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("******* Adventure Game *******");
        System.out.print("Enter your username: ");
        String userName = scanner.nextLine();

        Player player = new Player(userName);
        System.out.println(player.getUserName() + "! You are welcome.\n");
        player.selectCharacter();

        while (true){
            player.printInfo();
            Location location = null;
            System.out.println("********** Locations **********");
            System.out.println("1-Safe House\n2-Tool Store" +
                    "\n*******************************");
            System.out.print("Choose where you want to go:");
            int locationSelection = scanner.nextInt();
            switch(locationSelection){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if(!location.onLocation()){
                System.out.println("GAME OVER!");
                break;
            }
            System.out.println();
        }
    }
}
