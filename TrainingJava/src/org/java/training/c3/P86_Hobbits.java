package org.java.training.c3;

public class P86_Hobbits {
	String name;
	public static void main(String[] args) {
		P86_Hobbits[] h = new P86_Hobbits[3];
		//h[0] = new P86_Hobbits();
		//h[1] = new P86_Hobbits();
		//h[2] = new P86_Hobbits();
		int z = 0;
		
		while( z < 3) {
			h[z] = new P86_Hobbits();
			h[z].name = "bilbo";
			if(z == 1) {
				h[z].name = "frodo";
			}
			if(z == 2) {
				h[z].name = "sam";
			}
			System.out.print(h[z].name + " is a good ");
			System.out.println("hobbit name");
			z++;
		}	
	}
}
