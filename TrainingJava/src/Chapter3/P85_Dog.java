package Chapter3;

public class P85_Dog {
	String name;
	public static void main(String[] args) {
		P85_Dog dog1 = new P85_Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		P85_Dog[] myDogs = new P85_Dog[3];
		myDogs[0] = new P85_Dog();
		myDogs[1] = new P85_Dog();
		myDogs[2] = dog1;
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);
		int x = 0;
		
		while(x < myDogs.length) {
			myDogs[x].bark();
			x++;
		}
	}
	void bark() {
		System.out.println(name + " says Ruff!");
	}
	void eat() {
		
	}
	void chaseCat() {
		
	}

}
