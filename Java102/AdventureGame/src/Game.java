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
    }
}
