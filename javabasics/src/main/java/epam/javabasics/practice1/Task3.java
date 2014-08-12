package epam.javabasics.practice1;

/**
 * Use arithmetic, increment/decrement, relational and boolean operators with the variables.
 */
public class Task3 {

    private static int a = 1;
    private static boolean b = false;
    private static float c = 3.25F;


    public static void main(String[] args) {

        Task3 task3 = new Task3();
        task3.arithmeticFunc(a, c);
        task3.boolLogic(3, 4);
    }

    public void arithmeticFunc(int a, float b) {
        float c = a*b;
        float d = a/c;
        System.out.printf("mult = %f, div = %f, inc = %f, dec = %f", c, d, c++, d--);
    }

    public void boolLogic(int a, int b) {
        System.out.printf("");
        System.out.println("a>b: " + (a>b));
        System.out.println("a!=b " + (a!=b));
    }
}
