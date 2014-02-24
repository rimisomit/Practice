package Chapter4;

public class P104_GoodDogTestDrive {
	public static void main (String[] args) {
		P104_GoodDog one = new P104_GoodDog();
		one.setSize(70);
		P104_GoodDog two = new P104_GoodDog();
		two.setSize(7);
		System.out.println("Dog one " + one.getSize());
		System.out.println("Dog two " + two.getSize());
		one.bark();
		two.bark();
	}

}
