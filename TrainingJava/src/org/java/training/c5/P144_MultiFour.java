package org.java.training.c5;

/**
 * Created by user on 3/3/14.
 */
public class P144_MultiFour {
    public static void main(String[] args) {
        for(int x = 0; x < 4; x++) {
            for(int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }
            if (x == 1) {
                x++;
            }
        }
    }
}
