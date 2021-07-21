public class EnhancedPlayer {
    //this is encapsulation, these are private and only accessible via a method
    private String name;
    private int health = 100;//we define a number for the health
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if(health > 0 && health <= 100){//validation
            this.health = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            //reduce number of lives for the player
        }
    }
    public int getHealth(){
        return this.health;
    }
}
