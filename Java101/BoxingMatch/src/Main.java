public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("A", 10, 120, 100, 50);
        Fighter fighter2 = new Fighter("B", 20, 85, 85, 40);

        Match match1 = new Match(fighter1,fighter2,85,100);

        match1.run();
    }
}