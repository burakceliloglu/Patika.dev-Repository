public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        if(this.getPlayer().getInventory().isWater() &&
                this.getPlayer().getInventory().isFireWood() &&
                this.getPlayer().getInventory().isFood()){
            System.out.println("You won the game!");
            return false;
        }
        System.out.println("You are in the Safe House.");
        System.out.println("Your health is renewed!");
        this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
        return true;
    }
}
