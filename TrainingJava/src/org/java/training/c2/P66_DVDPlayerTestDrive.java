package org.java.training.c2;

public class P66_DVDPlayerTestDrive {
	public static void main(String[] args) {
		P66_DVDPlayer d = new P66_DVDPlayer();
		
		d.canRecord = true;
		d.playDVD();
		
		if (d.canRecord == true ) {
			d.recordDVD();
		}
		
	}
}
