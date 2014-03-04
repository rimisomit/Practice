package org.java.training.c6;

/**
 * Created by user on 3/4/14.
 */
import java.util.*;
public class P171_DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> cells) {
        locationCells = cells;
    }
    public void setName(String n) {
        name = n;
    }
    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }

}
