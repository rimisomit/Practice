package org.java.training.c1;
public class P48_Puzzzle {
	public static void main(String[] args) {
		int x = 0;
		while (x < 4) { //<-
			System.out.print("a"); //<-
			//System.out.println(" x= " + x);
			if (x < 1) {
				System.out.print(" "); //<-
			}
			System.out.print("n"); //<-
			if (x > 1) { //<-
				System.out.print(" oyster"); //<-
				x = x + 2; //<-
			}
			if (x == 1) {
				System.out.print("noys");
			}
			if (x < 1) {
				System.out.print("oise");
			}
			System.out.println("");
			x = x + 1; //<-
		}
	}

}
