package org.java.training.c6;

import java.util.ArrayList;

/**
 * Created by user on 3/4/14.
 */
public class P167_DotComBust {
    private P173_GameHelper helper = new P173_GameHelper();
    private ArrayList<P171_DotCom> dotComList = new ArrayList<P171_DotCom>();
    private int numOfGuesses = 0;
    public void setUpGame() {
        P171_DotCom one = new P171_DotCom();
        one.setName("Pets.com");
        P171_DotCom two = new P171_DotCom();
        two.setName("eToys.com");
        P171_DotCom three = new P171_DotCom();
        three.setName("Go2.com");
        System.out.println("Your goal is to sink three dot coms");
        for(P171_DotCom dotComToSet: dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    public void startPlaying() {
        while(dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    public void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (P171_DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(dotComToTest);
                break;
            }
            System.out.println(result);
        }
    }
    public void finishGame() {
        System.out.println("All dot coms are dead! Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses");
        }
    }
    public static void main(String[] args) {
        P167_DotComBust game = new P167_DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
