package org.java.training.c7;

/**
 * Created by user on 4/3/14.
 */
public class P207_AnimalsTestDrive {
    public static void main(String[] args) {
        P192_Animal[] animals = new P192_Animal[5];
        animals[0] = new P192_Cat();
        animals[1] = new P192_Dog();
        animals[2] = new P192_Hippo();
        animals[3] = new P192_Wolf();

        for (int i = 0; i < animals.length-1; i++) {
            animals[i].roam();
        }
        //animals[3].roam();
    }

}
