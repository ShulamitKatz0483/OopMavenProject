package oopMavenProject.Animal.com;

public class TestAnimal {
	public static void main(String[] args) {
		checkDog();
		checkCat();
		checkFrog();
		checkAnimal();
	}

	private static void checkAnimal() {
		Animal DogIsAnimal = new Dog(true, true, 1);
		DogIsAnimal.sayHello();
		Animal CatIsAnimal = new Cat(true, true, 1);
		CatIsAnimal.sayHello();
		Animal FrogIsAnimal = new Frog(false, false, 1);
		FrogIsAnimal.sayHello();
	}

	private static void checkFrog() {
		Frog frog = new Frog(false, false, 2);
		frog.sayHello();
		frog.sayHello(2);
	}

	private static void checkCat() {
		Cat cat = new Cat(true, true, 2);
		cat.sayHello();
		cat.sayHello(2);
	}

	private static void checkDog() {
		Dog dog = new Dog(true, true, 1);
		dog.sayHello();
		dog.sayHello(2);
	}

}
