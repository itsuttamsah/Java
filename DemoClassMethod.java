class Student{
    String name, faculty;
    int roll;

    public void setInfo()
    {
        name = "Uttam";
        faculty = "BEIT";
        roll = 33;
    }
    public void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Faculty : " + faculty);
        System.out.println("Roll No. : " + roll);
        
    }
}

public class DemoClassMethod
{
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setInfo();
        obj.display();      
    }
}
