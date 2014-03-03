package org.java.training.c4;
class P112_Mix4 {
	int counter = 0;
	public static void main(String[] args) {
		int count = 0;
		P112_Mix4[] m4a = new P112_Mix4[20];
		int x = 0;
		while (x < 20) {
			m4a[x] = new P112_Mix4();
			m4a[x].counter = m4a[x].counter + 1;
			count = count + 1;
			count = count + m4a[x].maybeNew(x);
			x++;
		}
		System.out.println("count: " + m4a[1].counter);
	}
	public int maybeNew(int index) {
		if (index < 5) {
			P112_Mix4 m4 = new P112_Mix4();
			m4.counter = m4.counter + 1;
			return 1;
		}
		return 0;
	}

}
