public class Main {

    public static void main(String[] args) {

        //This states that it will only accept Team-FootballPlayer
	League<Team<FootballPlayer>> footballLeague = new League<>("AFL");


        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> freemantle = new Team<>("Freemantle");
        Team<BaseBallPlayer> baseballTeam = new Team<>("Bulls");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(freemantle);

        //footballLeague.add(baseballTeam);//doesn't work due to generics

        hawthorn.matchResult(freemantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(freemantle, 2, 1);

        footballLeague.showLeagueTable();


    }
}
