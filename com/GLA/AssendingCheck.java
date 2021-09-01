package com.GLA;

public class AssendingCheck {
    public static void main (String[] args) {
        int h1 = Integer.parseInt(args[0]);
        int h2= Integer.parseInt(args[1]);
        int h3 =Integer.parseInt(args[2]);
        System.out.println((h1 <h2) && (h2 < h3));
    }
}
