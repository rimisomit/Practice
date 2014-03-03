package org.java.training.c5;

public class P144_Output {
    public static void main(String[] args) {
        P144_Output op = new P144_Output();
        op.go();
    }
    void go() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14 ) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }

}
