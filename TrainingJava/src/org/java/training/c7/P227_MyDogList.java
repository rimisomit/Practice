package org.java.training.c7;

/**
 * Created by user on 4/16/14.
 */
public class P227_MyDogList {
    private P192_Dog [] dogs = new P192_Dog[5];
    private int nextIndex = 0;

    public void add(P192_Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("New dog added at " + nextIndex);
            nextIndex++;
        }
    }
}
