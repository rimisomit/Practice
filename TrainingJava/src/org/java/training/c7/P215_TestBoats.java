package org.java.training.c7;

/**
 * Created by user on 4/14/14.
 */
public class P215_TestBoats {
    public static void main(String[] args) {
        P215_Boat b1 = new P215_Boat();
        P215_SailBoat b2 = new P215_SailBoat();
        P215_RowBoat b3 = new P215_RowBoat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}
