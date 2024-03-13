package oopMavenProject.Animal.com;

public abstract class Animal {

	protected boolean mammals;
	protected boolean carnivorous;
	protected int mood;
	public static final int MOOD_HAPPY = 1;
	public static final int MOOD_SCARE = 2;

	Animal(boolean mammals, boolean carnivorous, int mood) {
		this.mammals = mammals;
		this.carnivorous = carnivorous;
		this.mood = mood;
	}

	/**
	 * The method print the voice Hello.
	 */
	public void sayHello() {
		System.out.println("Hello");
	}

	/**
	 * The method print the voice according to say parameter, the method is realized
	 * in the inheritance children.
	 */
	public abstract void sayHello(int say);

	public boolean isMammals() {
		return mammals;
	}

	public void setMammals(boolean mammals) {
		this.mammals = mammals;
	}

	public boolean isCarnivorous() {
		return carnivorous;
	}

	public void setCarnivorous(boolean carnivorous) {
		this.carnivorous = carnivorous;
	}

	public int getMood() {
		return mood;
	}

	public void setMood(int mood) {
		this.mood = mood;
	}

}
