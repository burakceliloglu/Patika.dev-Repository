public class Inventory {
    boolean water;
    boolean food;
    boolean fireWood;
    private String weaponName;
    private String armorName;
    private int weaponDamage;
    private int armorDefence;

    public Inventory() {
        this.weaponName = "Punch";
        this.weaponDamage = 0;
        this.armorName = "Naked";
        this.armorDefence = 0;
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

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getArmorDefence() {
        return armorDefence;
    }

    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }
}