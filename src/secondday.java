//class secondday {
//    double width;
//    double Height;
//    public secondday(double l, double b){
//        width=l;
//        Height=b;
//    }
//    public double Area(){
////        System.out.println("Area");
//        return width * Height;
//    }
//    public  double peri(){                                                // Question 1
//        System.out.println();
//        return 2*width+Height;
//    }
//}
//class res{
//    public static void main(String[] args) {
//        secondday a=new secondday(5.5,8.5);
//        System.out.println(a.Area());
////        System.out.println(a.peri());
//    }
//}


import java.util.Scanner;

public class secondday{
    public static void main(String[] args) {
        int temp;
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter Second Number");
        int b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

    }
}