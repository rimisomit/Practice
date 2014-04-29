package other;

/**
 * Created by user on 4/27/14.
 */
public class logic {
    public static void main(String[] args) {
        boolean bool = false;
        int a = 5;
        if (bool) {
            System.out.println("true");
        } else {
            System.out.println("not true");
            System.out.println("\n");
        }
        switch (a) {
            case 5:
                System.out.println(5);
                break;
            case 6:
                System.out.println(6);
                break;
        }
    }

}
