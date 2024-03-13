package oopMavenProject.Animal.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnimal {

	@Test
	public void testDog() {
		Dog dog = new Dog(true, true, 1);
		assertEquals(4, dog.getNumberOfLegs());
		assertTrue(dog.isMammals());
		assertTrue(dog.isCarnivorous());
	}

	@Test
	public void testCat() {
		Cat cat = new Cat(true, true, 2);
		assertEquals(4, cat.getNumberOfLegs());
		assertTrue(cat.isMammals());
		assertTrue(cat.isCarnivorous());
	}

	@Test
	public void testFrog() {
		Frog frog = new Frog(false, false, 2);
		assertEquals(4, frog.getNumberOfLegs());
		assertFalse(frog.isMammals());
		assertFalse(frog.isCarnivorous());
		assertTrue(frog.hasGills());
		assertTrue(frog.hasLaysEggs());
	}
}
