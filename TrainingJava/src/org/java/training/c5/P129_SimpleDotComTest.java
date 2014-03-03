package org.java.training.c5;

/**
 * Created by user on 2/26/14.
 */
public class P129_SimpleDotComTest {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        P129_SimpleDotCom theDotCom = new P129_SimpleDotCom();
        P134_GameHelper helper = new P134_GameHelper();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " number of guesses");
            }
        }
    }
}
