package oopMavenProject.Animal.com;

public class Cat extends Animal implements Land {

	int numberOfLegs;

	Cat(boolean mammals, boolean carnivorous, int mood) {
		super(mammals, carnivorous, mood);
		this.numberOfLegs = 4;
	}

	/**
	 * The method print the voice according to mood attribute. if the value of the
	 * mood is 1 the method print Purr... if the value of the mood is 2 the method
	 * print Hiss, else the method print Meow.
	 */
	@Override
	public void sayHello() {
		if (mood == MOOD_HAPPY) {
			System.out.println("Purr, Purr");
		} else if (mood == MOOD_SCARE) {
			System.out.println("Hiss");
		} else {
			System.out.println("Meow~");
		}
	}

	/**
	 * The method print the voice according to say parameter.
	 * 
	 * @param say if the value of the param is 1 the method print Purr... if the
	 *            value of the param is 2 the method print Hiss, else the method
	 *            print Meow.
	 */
	@Override
	public void sayHello(int say) {
		if (say == MOOD_HAPPY) {
			System.out.println("Purr, Purr");
		} else if (say == MOOD_SCARE) {
			System.out.println("Hiss");
		} else {
			System.out.println("Meow~");
		}
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	

	

}
