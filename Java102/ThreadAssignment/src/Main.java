import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        for(int i=1; i<=4; i++){
            Thread t = new Thread(counter);
            t.start();
            t.join();
        }

        System.out.println("ODDS: " + Counter.odds.size());
        System.out.println("EVENS: " + Counter.evens.size());
    }
}