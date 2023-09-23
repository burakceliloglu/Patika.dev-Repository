import java.util.Random;

public abstract class BattleLocation extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;
    int monsterNumber;
    public BattleLocation(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
        randomMonsterNumber();
    }

    @Override
    public boolean onLocation() {
        System.out.println("Right now you are here: " + this.getName());
        System.out.println("Be careful! " + monsterNumber + " " +this.getMonster().getName()
                + " is/are living here.");
        System.out.print("Fight(Press F) or Flight(Press 0): ");
        String selectCase = scanner.nextLine();
        selectCase = selectCase.toUpperCase();
        if(selectCase.equals("F")) {
            if(combat(monsterNumber)){
                System.out.println("you have wiped out the " + this.getName());
                return true;
            }
        } else if (selectCase.equals("0")){
            return true;
        }
        if(this.getPlayer().getHealth()<=0){
            System.out.println("You dead.");
            return false;
        }
        return true;
    }

    public boolean combat(int maxMonster){
        for(int i=1; i<=maxMonster; i++){
            this.getMonster().setHealth(this.getMonster().getDefaultHealth());
            System.out.println("******** Your status **********");
            this.getPlayer().printInfo();
            System.out.println("******* " + this.getMonster().getName() +
                    "'s status *******");
            monsterStatus();
            while (this.getPlayer().getHealth()>0 && this.getMonster().getHealth()>0) {
                System.out.print("Fight(Press F) or Flight(Press 0): ");
                String selectCombat = scanner.nextLine();
                selectCombat = selectCombat.toUpperCase();
                if(selectCombat.equals("F")){
                    int random = (int) (Math.random()*2);
                    if(random == 0){
                        System.out.println("You hit!");
                        this.monster.setHealth(this.monster.getHealth()-this.getPlayer().getDamage());
                        afterHit();
                        if(this.getMonster().getHealth()>0){
                            System.out.println(this.monster.getName() + " hit you!");
                            int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmorDefence();
                            if(monsterDamage<0){
                                monsterDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                            afterHit();
                        }
                    }
                    else if(random == 1){
                        System.out.println(this.monster.getName() + " hit you!");
                        int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmorDefence();
                        if(monsterDamage<0){
                            monsterDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                        afterHit();
                        if(this.getPlayer().getHealth()>0){
                            System.out.println("You hit!");
                            this.monster.setHealth(this.monster.getHealth()-this.getPlayer().getDamage());
                            afterHit();
                        }
                    }
                }else{
                    return false;
                }
            }
            if(this.getMonster().getHealth() < this.getPlayer().getHealth()) {
                System.out.println(this.getMonster().getName() + "'s defeated!");
                System.out.println("You won: " + this.getMonster().getAward() + " money");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAward());
                System.out.println("Your money: " + this.getPlayer().getMoney());
                if(this.getMonster().getName().equals("Zombie")){
                    this.getPlayer().getInventory().setFood(true);
                }
                else if(this.getMonster().getName().equals("Bear")){
                    this.getPlayer().getInventory().setFood(true);
                }
                else if(this.getMonster().getName().equals("Vampire")){
                    this.getPlayer().getInventory().setFireWood(true);
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public void monsterStatus(){
        System.out.println("Health: " + this.getMonster().getHealth() +
                "\nDamage: " + this.getMonster().getDamage() +
                "\nAward: " + this.getMonster().getAward()
        );
    }

    public void afterHit(){
        System.out.println("*********** Status *************");
        System.out.println("Your health: " + this.getPlayer().getHealth() +
                "\n" + this.getMonster().getName() + "'s health: " +
                this.getMonster().getHealth());
        System.out.println();
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

    public void randomMonsterNumber(){
        Random random = new Random();
        this.monsterNumber = random.nextInt(this.getMaxMonster())+1;
    }
}
