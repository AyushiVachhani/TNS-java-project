// Abstract keyword
public class Abstract_keyword {

	public static void main(String[] args) {
		
		Dog D = new Dog();
		Cat C = new Cat();
		D.makeSound();
		C.makeSound();
	}

}

 abstract class Animal {
	String Name;
	int Age;
	abstract void makeSound();
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("A bark is a sound produced by dogs");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("A cat produce a meow sound");
	}
}