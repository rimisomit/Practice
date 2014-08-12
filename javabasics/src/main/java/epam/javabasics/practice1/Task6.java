package epam.javabasics.practice1;

import java.util.Scanner;

/**
 * Console input/output example
 */
public class Task6 {

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.printName(task6.askName());
        task6.replaceFirstSymbolWithCapLetter(task6.askName());
    }

    /**
     * Ask a user to enter name.
     * @return user input
     */
    public String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a name: ");
        return scanner.next();
    }

    /**
     * Print user information
     * @param name
     */
    public void printName(String name) {
        System.out.println("Your name is: " + name);
    }

    /**
     * Replace the first character of the name by correspondent upper case character;
     * @param name
     */
    public void replaceFirstSymbolWithCapLetter(String name) {
        String capitalizedName = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        System.out.println("Formatting: "+ capitalizedName);
    }
}
