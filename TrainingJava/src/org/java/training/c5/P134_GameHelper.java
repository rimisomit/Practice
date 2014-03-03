package org.java.training.c5;

/**
 * Created by user on 2/26/14.
 */
import java.io.*;
public class P134_GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
                System.out.println("Exception " + e);
            }
        return inputLine;
    }
}
