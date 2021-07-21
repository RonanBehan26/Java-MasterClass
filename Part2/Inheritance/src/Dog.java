public class Dog extends Animal {

    //now we can add some extra fields/variables unique to dogs but maybe not all animals
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //so the dog has the above characteristics but also the ones below but these are
    //kept in animal

//    public Dog(String name, String brain, String body, String size, String weight) {
//        //the 5 above deal with the animal class, initialized the base characteristics
//        super(name, brain, body, size, weight);

//        //super calls the contructor for the class we are extending/inheriting from

    //XXXXXXXXXXX Important

    //he goes onto to change this as he wants to put in the fields above
    //note a slight change to the animal fields, gets rid of brain and body from the params
    //and replaces them in the super with his own ints (NOTE!!!!!!!)
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
        super(name, 1, 1, size, weight);//other values are input in the main class
        //all dogs have 1 brain, body
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //dog unique method
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override //from super class
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();//call the chew method from this class
        super.eat();//this super means it's reverting to the super class to that original eat method
    }

    //new vid
    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
