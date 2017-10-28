
public class ClassTest {

	public static void main(String[] args) {
		Mammal mammal1 = new Mammal();
		mammal1.speak();
		
		Cat cat = new Cat();
		cat.speak();
		cat.scratch();
		
		Lion lion = new Lion();
		lion.speak();
		lion.scratch();
		lion.sleep();
		
		System.out.println(mammal1);
	}

}
