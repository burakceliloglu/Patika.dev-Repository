public class ToolStore extends NormalLocation{
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\n********* Tool  Store *********");
        System.out.println("1-Weapons\n2-Armors\n3-Exit");
        System.out.println("*******************************");
        System.out.print("Select the action you want to make(1/2/3): ");
        int actionSelection = scanner.nextInt();
        while(actionSelection<1 || actionSelection>3){
            System.out.print("Invalid number. Enter the action" +
                    "again(1/2/3): ");
        }
        switch (actionSelection){
            case 1:
                weaponShow();
                buyWeapon();
                break;
            case 2:
                armorShow();
                buyArmor();
                break;
            case 3:
                System.out.println("Come back anytime.");
        }
        return true;
    }

    public static int weaponSelection;
    public void weaponShow(){
        System.out.println("\n********** Weapons ***********");
        System.out.println("1-Pistol (Damage=2 Cost=25)\n" +
                "2-Sword (Damage=3 Cost=35)" +
                "\n3-Rifle (Damage=7 Cost=45)\n*********" +
                "**********************");
        System.out.print("Choose your weapon(1/2/3)[For exit press 0]: ");
        weaponSelection = scanner.nextInt();
        while(weaponSelection<0 || weaponSelection>3){
            System.out.print("Invalid number. Enter the action" +
                    "again(1/2/3): ");
        }
    }

    // Each method should do 1 task. So we separated
    // buy weapon and weapon show.
    public void buyWeapon(){
        // We could also create a Weapon class.
        switch(weaponSelection){
            case 0:
                System.out.println("Exit without purchase.");
                break;
            case 1:
                if(this.getPlayer().getMoney()<25){
                    System.out.println("You do not have enough money.");
                }
                else{
                    System.out.println("Successful pistol purchase.");
                    int balance = this.getPlayer().getMoney() - 25;
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your balance: " +
                            this.getPlayer().getMoney());
                    System.out.println("Weapon that you have: " +
                            this.getPlayer().getInventory().getWeaponName());
                    this.getPlayer().getInventory().setWeaponDamage(2);
                    this.getPlayer().getInventory().setWeaponName("Pistol");
                }
                break;
            case 2:
                if(this.getPlayer().getMoney()<35){
                    System.out.println("You do not have enough money.");
                }
                else{
                    System.out.println("Successful sword purchase.");
                    int balance = this.getPlayer().getMoney() - 35;
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your balance: " +
                            this.getPlayer().getMoney());
                    System.out.println("Weapon that you have: " +
                            this.getPlayer().getInventory().getWeaponName());
                    this.getPlayer().getInventory().setWeaponDamage(3);
                    this.getPlayer().getInventory().setWeaponName("Sword");
                }
                break;
            case 3:
                if(this.getPlayer().getMoney()<45){
                    System.out.println("You do not have enough money.");
                }
                else{
                    System.out.println("Successful rifle purchase.");
                    int balance = this.getPlayer().getMoney() - 45;
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your balance: " +
                            this.getPlayer().getMoney());
                    System.out.println("Weapon that you have: " +
                            this.getPlayer().getInventory().getWeaponName());
                    this.getPlayer().getInventory().setWeaponDamage(7);
                    this.getPlayer().getInventory().setWeaponName("Rifle");
                }
                break;
        }
    }
    public static int armorSelection;
    public void armorShow(){
        System.out.println("\n*********** Armors ************");
        System.out.println("1-Light (Dodge=1 Cost=15)\n" +
                "2-Medium (Dodge=3 Cost=25)" +
                "\n3-Heavy (Dodge=5 Cost=45)\n*********" +
                "**********************");
        System.out.print("Choose your armor(1/2/3)[For exit press 0]: ");
        armorSelection = scanner.nextInt();
        while(armorSelection<0 || armorSelection>3){
            System.out.print("Invalid number. Enter the action" +
                    "again(1/2/3): ");
        }
    }
    public void buyArmor(){
        // We could also create an Armor class.
        switch(armorSelection){
            case 0:
                System.out.println("Exit without purchase.");
                break;
            case 1:
                if(this.getPlayer().getMoney()<15){
                    System.out.println("You do not have enough money.");
                }
                else{
                    System.out.println("Successful light armor purchase.");
                    int balance = this.getPlayer().getMoney() - 15;
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your balance: " +
                            this.getPlayer().getMoney());
                    System.out.println("Armor that you had: " +
                            this.getPlayer().getInventory().getArmorName());
                    this.getPlayer().getInventory().setArmorDefence(1);
                    this.getPlayer().getInventory().setArmorName("Heavy Armor");
                }
                break;
            case 2:
                if(this.getPlayer().getMoney()<25){
                    System.out.println("You do not have enough money.");
                }
                else{
                    System.out.println("Successful mid armor purchase.");
                    int balance = this.getPlayer().getMoney() - 25;
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your balance: " +
                            this.getPlayer().getMoney());
                    System.out.println("Armor that you had: " +
                            this.getPlayer().getInventory().getArmorName());
                    this.getPlayer().getInventory().setArmorDefence(3);
                    this.getPlayer().getInventory().setArmorName("Mid Armor");
                }
                break;
            case 3:
                if(this.getPlayer().getMoney()<45){
                    System.out.println("You do not have enough money.");
                }
                else{
                    System.out.println("Successful heavy armor purchase.");
                    int balance = this.getPlayer().getMoney() - 45;
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your balance: " +
                            this.getPlayer().getMoney());
                    System.out.println("Armor that you had: " +
                            this.getPlayer().getInventory().getArmorName());
                    this.getPlayer().getInventory().setArmorDefence(5);
                    this.getPlayer().getInventory().setArmorName("Heavy Armor");
                }
                break;
        }
    }
}