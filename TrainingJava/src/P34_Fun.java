public class P34_Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		String name = "Dirk";
		x = x * 17;
		System.out.println("x is " + x);
		double d = Math.random();

		while (x > 12) {
			x = x - 1;
		}

		for(int x1 = 0; x1 < 10; x1 = x1 + 1) {
			System.out.println("x1 is now " + x1);
		}

		int x2 = 10;
		if (x2 == 10) {
			System.out.println("x2 must be 10");
		} else {
			System.out.println("x2 is not 10");
		}
		int x3 = 2;
		if ((x3 < 3) & (name.equals("Dirk"))) {
			System.out.println("Gently");
		}
		System.out.println("This line runs no matter what");


	}

}
