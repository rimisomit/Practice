package other;

/**
 * Created by user on 4/27/14.
 */
public class logic2 {
    static int a = 5;
    static int b = 1;
    static boolean bool = true;
    public static void main(String[] args) {
        if (a == b && bool) {
            System.out.println("T");
        }
        if (a == b || bool) {
            System.out.println("!T");
        }
    }
}
