public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;


    //we automatically generated the contructor here,
    //it has all the fields from this class and the animal class
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        //here we are doing as we did in dog, remove brain and body from the body and brain
        //and we add just one and one into the super params
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
