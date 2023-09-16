public class Inventory {
    boolean water;
    boolean food;
    boolean fireWood;
    private String weaponName;
    String armorName;
    private int weaponDamage;
    int armorDefence;

    public Inventory() {
        this.weaponName = "Punch";
        this.weaponDamage = 0;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
}