package Chapter3;

public class P88_Triangle {
	double area;
	int height;
	int length;
	public static void main(String[] args) {
		P88_Triangle[] ta = new P88_Triangle[4]; //<--
		int x = 0; //<--
		while(x < 4) { //<--
			ta[x] = new P88_Triangle(); //<--
			ta[x].height = (x + 1) * 2; //<--
			ta[x].length = x + 4 ; //<--
			ta[x].setArea();
			System.out.print("triangle " + x + " area");
			System.out.println(" = " + ta[x].area);
			x++; //<--
		}
		int y = x;//<--
		x = 27;
		P88_Triangle t5 = ta[2];
		ta[2].area = 343;
		System.out.print("y = " + y);
		System.out.println(", t5 area = " + t5.area);
	}
	void setArea() {
		area = (height * length) / 2 ; //<--
	}
}
