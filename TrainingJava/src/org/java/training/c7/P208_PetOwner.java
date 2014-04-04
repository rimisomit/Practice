package org.java.training.c7;

/**
 * Created by user on 4/4/14.
 */
public class P208_PetOwner {
    public void start() {
        P208_Vet v = new P208_Vet();
        P192_Dog d = new P192_Dog();
        P192_Hippo h = new P192_Hippo();

        v.giveShot(d);
        v.giveShot(h);
    }
}
