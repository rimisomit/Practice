package Chapter2;

public class P62_Player {
	int number = 0;
	
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I am guessing " + number);
	}			
}
