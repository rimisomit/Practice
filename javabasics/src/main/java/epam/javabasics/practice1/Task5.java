package epam.javabasics.practice1;

/**
 * Create few String variables and try to perform following transformations and print the results:
 */
public class Task5 {

    private static String name = "Vasya", surname = "Petrov";

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        task5.concatStrings(name, surname);
        task5.getCertainSymbol(name, 2);
        task5.compareStrings(name, surname);
        task5.checkForSubstring(surname, "tro");
    }

    public void concatStrings(String a, String b) {
        System.out.println(a + " " + b);
        System.out.println(a.concat(b));
    }

    public void getCertainSymbol(String a, int b) {
        System.out.println(a.charAt(b));
    }

    public void compareStrings(String a, String b) {
        System.out.println(a.compareTo(b));
    }

    public void checkForSubstring(String a, String b) {
        System.out.println(a.contains(b));
    }

    public void checkEndsOrStarts(String a, String b) {
        System.out.println(a.startsWith(b));
        System.out.println(a.endsWith(b));
    }
    public void checkEquals(String a, String b) {
        System.out.println(a.equals(b));
    }


}
