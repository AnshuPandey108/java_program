/**
 * Student
 */
class Student {
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("Enter Roll,name and marks:");
    }
    
}

public class  StudentS extends Student {
    void disp()
    {
        roll=1;name="Anshu";marks=97;
        System.out.println(roll+"  "+name+"  "+marks);
    }
    public static void main(String[] args) {
        StudentS r=new StudentS();
        r.input(); r.disp();
    }
    
}
