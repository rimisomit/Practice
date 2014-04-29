package other;

/**
 * Created by user on 4/27/14.
 */
public class LoopsJ {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int n = 0;
        while (n < 10) {
            System.out.println(n);
            n++;
        }
        String[] st = "a b c d e f g h j k l m".split(" ");
        for (String s:st) {
            System.out.println(s);
        }
    }
}
