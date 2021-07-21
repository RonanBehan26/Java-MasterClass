import java.beans.EventHandler;

public class Main {

    public static void main(String[] args) {
        //With Encapsulation
        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
        //we don't have access to the variable so we must use the get variable
        System.out.println("Initial health is " + player.getHealth());

        //Without Encapsulation
//        Player player = new Player();
//        //we can enter these in as we have set the variables as public in Player
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
