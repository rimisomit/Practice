package org.java.training.c6;

/**
 * Created by user on 3/4/14.
 */
import java.io.*;
import java.util.*;

public class P173_GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int getGridSize = gridLength^2;
    private int[] grid = new int[getGridSize];
    private int comCount = 0;
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphaCoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1) {
            incr = gridLength;
        }

        while (!success & attempts++ < 200 ) {

        }
        return alphaCells;
    }
}
