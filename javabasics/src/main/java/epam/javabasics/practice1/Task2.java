package epam.javabasics.practice1;

/**
 * Refactor the code from the previous task with using constants.
 */
public class Task2 {
    public static void main(String[] args) {
        final byte BYTE_A;
        final short SHORT_B;
        final int INT_C;
        final long LONG_D;
        final float FLOAT_E;
        final double DOUBLE_F;
        final boolean BOOL_G;
        final char CHAR_H;

        BYTE_A = 127;
        SHORT_B = 30000;
        INT_C = 2000000;
        LONG_D = 2000000000L;
        FLOAT_E = 0.25F;
        DOUBLE_F = Math.PI;
        BOOL_G = true;
        CHAR_H = 'a';

        short b1 = BYTE_A;
        float e1 = (float) DOUBLE_F;
        int c1 = (int) FLOAT_E;

    }
}
