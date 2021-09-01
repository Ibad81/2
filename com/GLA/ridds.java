package com.GLA;


import java.util.Scanner;

public class ridds {
    public static void main(String args[]){
        int var1,var2,temp;
        Scanner sc=new Scanner(System.in);

        var1=sc.nextInt();
        var2=sc.nextInt();
        System.out.println(".........value for swapping.......");
        System.out.println("value of var1="+var1);
        System.out.println("value of var2="+var2);
        temp=var1;
        var1=var2;
        var2=temp;


        System.out.println("........orginal value......");
        System.out.println("value of var1="+var1);
        System.out.println("value of var2="+var2);
    }
}
