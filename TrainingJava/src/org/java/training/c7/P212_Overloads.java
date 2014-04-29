package org.java.training.c7;

/**
 * Created by user on 4/10/14.
 */
public class P212_Overloads {
    String uniqueID;

    public int addNumbs(int a, int b) {
        return a + b;
    }

    public double addNumbs(double a, double b) {
        return a + b;
    }

    public void setUniqueID (String theID) {
        uniqueID = theID;
    }

    public void setUniqueID (int ssNumber) {
        String stringID = "" + ssNumber;
        setUniqueID(stringID);
    }
}
