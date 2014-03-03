package org.java.training.c1;
public class P47_Test {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while(x < 5) {
			
			//y = x - y;
			
			//y = x + y;
			
			//y = y + 2;
			//if(y > 4) {
			//	y = y - 1;
			//}
			
			//x = x + 1;
			//y = y + x;
			
			if(y < 5) {
				x = x + 1;
				if(x < 3) {
					x = x - 1;
				}
			} 
			y = y + 2;
			
			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}

}
