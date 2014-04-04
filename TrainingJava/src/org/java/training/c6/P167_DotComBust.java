package org.java.training.c6;
import java.util.ArrayList;
/**
 * Created by user on 3/4/14.
 */
public class P167_DotComBust {
    private P173_GameHelper helper = new P173_GameHelper();
    private ArrayList<P171_DotCom> dotComsList = new ArrayList<P171_DotCom>();
    private int numOfGuesses = 0;
    private void setUpGame() {
        P171_DotCom one = new P171_DotCom();
        one.setName("Pets.com");
        P171_DotCom two = new P171_DotCom();
        two.setName("eToys.com");
        P171_DotCom three = new P171_DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Your goal is to sink three dot coms");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for(P171_DotCom dotComToSet: dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess: ");
            //System.out.println(userGuess);
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        //System.out.println(result);
        for (P171_DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            //System.out.println(result);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
            System.out.println(result);
        }
    }
    private void finishGame() {
        System.out.println("All dot coms are dead! Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
    public static void main(String[] args) {
        P167_DotComBust game = new P167_DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
