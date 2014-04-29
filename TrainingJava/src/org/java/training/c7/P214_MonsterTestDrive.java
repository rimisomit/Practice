package org.java.training.c7;

/**
 * Created by user on 4/10/14.
 */
public class P214_MonsterTestDrive {
    public static void main(String[] args) {
        P214_Monster [] ma = new P214_Monster[3];
        ma[0] = new P214_Vampire();
        ma[1] = new P214_Dragon();
        ma[2] = new P214_Monster();
        for(int x = 0; x < 3; x++) {
            ma[x].fighten(x);
        }
    }

}
