package epam.javabasics.practice1;

/**
 * Use Math class methods with the variables.
 */
public class Task4 {

    private float a = 3.12F;
    private float b = (float) Math.PI;
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.mathThrash();
    }

    public void mathThrash() {
        System.out.printf("Sin = %f, Cos = %f, Pov = %f", Math.sin((double) a), Math.log10((double) b), Math.pow((double) a, (double) b));
    }
}
