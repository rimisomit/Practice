package org.java.training.c2;

public class P68_EchoDestDrive {
	public static void main(String[] args) {
		P68_Echo e1 = new P68_Echo();
		P68_Echo e2 = new P68_Echo();  //<--
		int x = 0;
		while(x < 4){ //<--
			e1.helo();
			e1.count = e1.count + 1; //<--
			if(x == 3) { //<--
				e2.count = e2.count + 1;
			}
			if(x > 0) {
				e2.count = e2.count + e1.count;
			}
			x = x + 1;
		}
	System.out.println(e2.count);	
	}
}
