
public class Cat extends Mammal {

	@Override
	public void speak() {
		System.out.println("Meow");
	}
	
	@Override
	public String toString() {
		return "Cat";
	}
	
	public void scratch() {
		System.out.println("I'm scratching");
	}
}
