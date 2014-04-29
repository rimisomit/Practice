package org.java.training.c7;

/**
 * Created by user on 4/10/14.
 */
public class P213_Mixed {
    public static void main(String[] arg) {
        P213_A a = new P213_A();
        P213_B b = new P213_B();
        P213_C c = new P213_C();
        P213_A a2 = new P213_C();
        a.m1();
        a.m2();
        a.m3();
        System.out.println();
        b.m1();
        b.m2();
        b.m3();
        System.out.println();
        c.m1();
        c.m2();
        c.m3();
        System.out.println();
        a2.m1();
        a2.m2();
        a2.m3();
    }
}
