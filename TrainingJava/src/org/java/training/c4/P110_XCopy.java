package org.java.training.c4;

class P110_XCopy {
	public static void main(String[] args) {
		int origin = 42;
		P110_XCopy x = new P110_XCopy();
		int y = x.go(origin);
		System.out.println(y);
	}
	int go(int arg) {
		arg = arg * 2;
		return arg;
	}

}
