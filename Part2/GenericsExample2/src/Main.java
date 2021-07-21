public class Main {

    public static void main(String[] args) {
	FootballPlayer joe = new FootballPlayer("Joe");
	BaseBallPlayer pat = new BaseBallPlayer("Pat");
	SoccerPlayer beckham = new SoccerPlayer("Beckham");

	//Problem to make sure that it will acccept a certain peson of a certain type
        //Team class has allowed us to add any type of player
        //we want to make sure only the right type of player joins
        //So we go to team and put in type T
        //then this
	//Team adelaideCrows = new Team("Adelaide Crows");
        //becomes
    Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
    //type football player, only joe will be added
	adelaideCrows.addPlayer(joe);
//	adelaideCrows.addPlayer(pat);
//	adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseBallPlayer> baseballTeam = new Team<>("Adelaide Crows");
        baseballTeam.addPlayer(pat);

        //Team<String> brokenTeam = new Team<>("this won't work");
        //T extends player, above in team so
        //now
        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> freemantle = new Team<>("Freemantle");

        hawthorn.matchResult(freemantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(freemantle, 2, 1);

        //Not the right type of team after we added
        //adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(freemantle));
    }
}
