package Chapter4;

public class P95_DogTestDrive {
	public static void main(String[] args) {
		P95_Dog one = new P95_Dog();
		one.size = 70;
		P95_Dog two = new P95_Dog();
		two.size = 8;
		P95_Dog three = new P95_Dog();
		three.size = 35;
		
		one.bark();
		two.bark();
		three.bark();
	}
}
