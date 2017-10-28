
public class Lion extends Cat {

	@Override
	public void speak() {
		System.out.println("ROAR!!");
	}
	
	@Override
	public String toString() {
		return "Lion";
	}
	
	public void sleep() {
		System.out.println("I'm sleeping");
	}
}
