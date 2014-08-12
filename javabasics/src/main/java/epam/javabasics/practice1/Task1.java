package epam.javabasics.practice1;

/**
 * Create and initialize 8 variables – one for each primitive type.
 * Assign the variables to a variable with a different type.
 * Try both widening and narrowing conversion.
 */
public class Task1 {
    public static void main(String[] args) {
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        boolean g;
        char h;

        a = 127;
        b = 30000;
        c = 2000000;
        d = 2000000000L;
        e = 0.25F;
        f = Math.PI;
        g = true;
        h = 'a';

        short b1 = a;
        float e1 = (float) f;
        int c1 = (int) e;

    }
}
