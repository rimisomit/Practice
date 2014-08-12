package epam.javabasics.practice1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * File input/output example: implement the functionality from previous example using files for input and output data.
 */
public class Task7 {

    private String file;

    public static void main(String[] args) throws FileNotFoundException {
        Task7 task7 = new Task7("src/main/file1.txt");
        Task6 task6 = new Task6();
        task6.printName(task7.readFromFile());
        task6.replaceFirstSymbolWithCapLetter(task7.readFromFile());
    }

    public Task7(String file) {
        this.file = file;
    }

    /**
     *
     * @return name
     * @throws FileNotFoundException
     */
    public String readFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(file));
        return scanner.next();
    }
}
