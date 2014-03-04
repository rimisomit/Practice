package org.java.training.c6;

import java.util.ArrayList;

/**
 * Created by user on 3/4/14.
 */
public class P167_DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    public void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        System.out.println("Your goal is to sink three dot coms");
        for(DotCom dotComToSet: dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    public void startPlaying() {
        while(dotComList.isEmpty()) {
            String userGuesses = helper.getUserInput("Enter a guess");
            checkUserGuess();
        }
        finishGame();
    }

    public void checkUserGuess() {
    }

    public void finishGame() {

    }
    public static void main(String[] args) {

    }
}
