public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.damage = damage;
        this.health = health;
        this.name = name;
        this.weight = weight;
        if(dodge >= 0 && dodge <=100){
            this.dodge = dodge;
        }
        else{
            this.dodge = 0;
        }
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " (-" + this.damage + ")");
        if(foe.isDodge()){
            System.out.println(foe.name + " dodged.");
            return foe.health;
        }
        if(foe.health - this.damage<0){
            return 0;
        }
        return foe.health-this.damage;
    }

    boolean isDodge(){
        double random = Math.random() * 100;
        return random <= this.dodge;
    }
}