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
                "\n3-Rifle (Damage=7 Money=45)\n*********" +
                "**********************");
        System.out.print("Choose your weapon(1/2/3): ");
        weaponSelection = scanner.nextInt();
        while(weaponSelection<1 || weaponSelection>3){
            System.out.print("Invalid number. Enter the action" +
                    "again(1/2/3): ");
        }
    }

    // Each method should do 1 task. So we separated
    // buy weapon and weapon show.
    public void buyWeapon(){
        // We could also create a Weapon class.
        switch(weaponSelection){
            case 1:
                if(this.getPlayer().getMoney()<25){
                    System.out.println("You do not have enough money.");
                }
                else{
                    System.out.println("Successful pistol purchase.");
                    int balance = this.getPlayer().getMoney() - 25;
                    this.getPlayer().setDamage(balance);
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
                    this.getPlayer().setDamage(balance);
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
                    this.getPlayer().setDamage(balance);
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
    public void armorShow(){
        System.out.println("\n*********** Armors ************");
    }
}
