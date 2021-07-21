public class Main {

    public static void main(String[] args) {
	Dog dog = new Dog("Yorkie");
	dog.breathe();
	dog.eat();

	//We made the Bird class abstract,
		//therefore you can't directly instantiate an abstract class
		//So we made the parrot class and extended it to Animal and used the
		//abstract method, so instead of...
	//Bird bird = new Bird("Parrot");
		Parrot parrot = new Parrot("PinkParrot");
		parrot.breathe();
		parrot.eat();
		parrot.fly();

		Penguin penguin = new Penguin("Emperor");
		penguin.fly();

    }
}
