class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependanceDay extends Movie {
    public IndependanceDay(){
        super("Independance Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{

    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try and take over the universe";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");

        //No plot here

    }
}



public class Main {

    public static void main(String[] args) {
        for(int i = 1; i<11; i++){
            Movie movie = randomMovie();//the \n generates a new line
            System.out.println("movie #" + i + " : " + movie.getName() + "\n"
                                                + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){ //int below as the math.random goes for a double immediately
        int randomNumber = (int)(Math.random()*5) +1;
        System.out.println("Random Number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependanceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();
        }

        return null;
    }
}
