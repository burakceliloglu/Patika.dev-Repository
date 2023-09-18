import java.util.Random;

public abstract class BattleLocation extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;
    public BattleLocation(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int monsterNumber = this.randomMonsterNumber();
        System.out.println("Right now you are here: " + this.getName());
        System.out.println("Be careful! " + monsterNumber + " " +this.getMonster().getName()
                + " is/are living here.");
        System.out.print("Fight(Press F) or Flight(Press 0): ");
        String selectCase = scanner.nextLine();
        selectCase = selectCase.toUpperCase();
        if(selectCase.equals("F")) {
            // SAVAŞ İŞLEMLERİ
        } else if (selectCase.equals("0")){
            // KAÇ
        }
        return true;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

    public int randomMonsterNumber(){
        Random random = new Random();
        return random.nextInt(this.getMaxMonster())+1;
    }
}
