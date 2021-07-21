public class Main {

    public static void main(String[] args) {
        //just the animal class
	Animal animal = new Animal("Animal", 1, 1, 5, 5);

	//now for the dog
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        System.out.println(dog.getName());

//        dog.eat(); // eat is defined in the animal class
//
//        //new vid
//        dog.walk();
//        dog.run();



    }
}
