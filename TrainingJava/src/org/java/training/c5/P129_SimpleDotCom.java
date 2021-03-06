package org.java.training.c5;

/**
 * Created by user on 2/26/14.
 */
public class P129_SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
            if (numOfHits == locationCells.length) {
                result = "kill";
            }
        }
        System.out.println(result);
        return result;
    }
}
