import java.util.Scanner;

public class Player {
    Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private String userName;
    private String characterName;
    private int defaultHealth;
    private Scanner scanner = new Scanner(System.in);

    public Player(String userName){
        this.userName = userName;
        this.inventory = new Inventory();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }

    public void selectCharacter() {
        System.out.println("***** Character Selection *****");
        System.out.println("1-Samurai (Damage=5 Health=21 Money=15)\n" +
                "2-Hawkeye (Damage=7 Health=18 Money=20)" +
                "\n3-Soldier (Damage=8 Health=24 Money=5)\n*********" +
                "**********************");
        System.out.print("Choose your character(1/2/3): ");
        int selection = scanner.nextInt();

        // We could also create a gameCharacter class.
        switch(selection){
            case 1:
                this.characterName = "Samurai";
                this.damage = 5;
                this.health = 21;
                this.money = 15;
                this.defaultHealth = 21;
                break;
            case 2:
                this.characterName = "Hawkeye";
                this.damage = 7;
                this.health = 18;
                this.money = 20;
                this.defaultHealth = 18;
                break;
            case 3:
                this.characterName = "Soldier";
                this.damage = 8;
                this.health = 24;
                this.money = 5;
                this.defaultHealth = 24;
                break;
            default:
                System.out.println("Invalid Number!");
                break;
        }
        System.out.println("Your character is -> " + this.characterName + "\n");
    }

    public void printInfo(){
        System.out.println(
                "Your weapon: " + this.getInventory().getWeaponName() +
                "\nYour armor: " + this.getInventory().getArmorName() +
                "\nYour damage: " + this.getDamage() +
                "\nYour dodge: " + this.getInventory().getArmorDefence() +
                "\nYour health: " + this.getHealth() +
                "\nYour money: " + this.getMoney()
        );

    }
}