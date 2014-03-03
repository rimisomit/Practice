package org.java.training.c4;
public class P113_Puzzle4b {
	int ivar;
	public int doStuff(int factor) {
		if (ivar > 100){
			return ivar * factor;
		} else {
			return ivar * (5 - factor);
		}
		
	}
}
