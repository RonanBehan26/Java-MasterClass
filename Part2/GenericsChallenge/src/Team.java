import java.util.ArrayList;

//before
//public class Team {
//after
public class Team<T extends Player> implements Comparable<Team<T>> {
    //above; comparing teams with teams, but only teams of the same sport
    //Team is the type and the BaseBall Player is T (or other sport)
    //So we will write a Comparable method, if it returns a negative number if less than the object,
    // positive if greater
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    //Abstract class Player, generics
    //then
    //private ArrayList<Player> members = new ArrayList<>();//but this accepts all so
    private ArrayList<T> members = new ArrayList<>();//do this and get an error in main broken team

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //We want to add the T so this, T the type of team like Baseball
    //public boolean addPlayer(Player player){
    //T is a parameterised Type
    //goes to this
    //public boolean addPlayer(T player){
        //to this
    public boolean addPlayer(T player){
        if(members.contains(player)){
            //this
            //System.out.println(player.getName() + " is already on this team");
            //to (cast the type), change it where you reference it
            //This is only temporary as we will change later
            //The change following as we have changed the para again in T extends player, above
            //System.out.println(((Player) player).getName() + " is already on this team");
            //to (same in next), (do this as you have T extends player, above
            System.out.println(player.getName() + " is already on this team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){

        String message;

        if(ourScore > theirScore){
            won++;
            message = " beat ";
        }else if(ourScore == theirScore){
            tied++;
            message = " drew with ";
        }else{
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
    public int ranking(){//how they are ranking in the league
        return (won * 2) + tied;
    }

    //current team vs the team put in the paam
    @Override
    public int compareTo(Team<T> team){
        if(this.ranking() > team.ranking()){
            return -1;
        }else if (this.ranking() < team.ranking()){
            return 1;
        }else {
            return 0;
        }
        //code in the main:
        //System.out.println(adelaideCrows.compareTo(melbourne));
    }
}
