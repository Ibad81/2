package com.GLA;
//public class First_program
//    {
//        {
//            public static void main(String[] args)
//        }
//
//        System.out.println("The sum of these number");
//        int num1=2;
//        int num2=6;
//        int num3=7;
//        int sum =num1+num2+num3;
//        System.out.println(sum);
//    }



public class First_program
{
    public int age;
    public char gender;
    public void display()
    {
        System.out.println(age);
        System.out.println(gender);

    }

}
class First_programMain
{
    public static void main (String[] args){
            First_program neeraj= new First_program();
        neeraj.age=51;
        neeraj.gender='M';
        neeraj.display();
    }

}