package org.java.training.c7;

/**
 * Created by user on 4/16/14.
 */
public class P228_MyAnimalList {
    private P192_Animal[] animals = new P192_Animal[5];
    private int nextIndex = 0;

    public void add(P192_Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added at " + nextIndex);
            nextIndex++;
        }
    }
}
