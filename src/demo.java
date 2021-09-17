class stu{
    int rollno;
    String name;
    int marks[];

    stu(){         //non parameterised
        rollno=20;
        name="Ibad";
        marks = new int[5];
        for (int i =0; i<marks.length; i++){
            marks[i]=0;
        }
    }
    public void display(){             //instance variable
        System.out.println(rollno);
        System.out.println(name);
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
public class demo{
    public static void main(String[] args) {
        stu obj=new stu();
        obj.display();
    }
}