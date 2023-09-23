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
            System.out.println("1-Safe House\n2-Tool Store\n3-Cave\n" +
                    "4-Forest\n5-River\n6-Mine\n*******************************");
            System.out.print("Choose where you want to go:");
            int locationSelection = scanner.nextInt();
            switch(locationSelection){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if(player.getInventory().isFood()){
                        System.out.println("The award already taken.");
                        System.out.println("You can't go to the Cave.");
                        location = new SafeHouse(player);
                    } else{
                        location = new Cave(player);
                    }
                    break;
                case 4:
                    if(player.getInventory().isFireWood()){
                        System.out.println("The award already taken.");
                        System.out.println("You can't go to the Forest.");
                        location = new SafeHouse(player);
                        break;
                    } else{
                        location = new Forest(player);
                    }
                    break;
                case 5:
                    if(player.getInventory().isWater()){
                        System.out.println("The award already taken.");
                        System.out.println("You can't go to the River.");
                        location = new SafeHouse(player);
                    } else{
                        location = new River(player);
                    }
                    break;
                case 6:
                    location = new Mine(player);
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
