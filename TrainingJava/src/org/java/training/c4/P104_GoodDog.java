package org.java.training.c4;

class P104_GoodDog {
	private int size;
	public int getSize() {
		return size;
	}
	public void setSize(int s) {
		size = s;
	}
	void bark() {
		if (size > 60) {
			System.out.println("Woof! Woof!");
		}
		else if (size > 14) {
			System.out.println("Ruf! Ruf!X");
		} else {
			System.out.println("Yip! Yip!");
		}
	}

}
