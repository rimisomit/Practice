package org.java.training.c5;

/**
 * Created by user on 2/26/14.
 */
public class P140_Output {
    public static void main(String[] args) {
        P140_Output o = new P140_Output();
        o.go();
    }
    void go() {
        int y = 7;
        for (int x = 0; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}
