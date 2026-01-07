class Student{
    String name;
    String faculty;
    int roll;

    public Student() {

    }
    
    public void setInfo()
    {
        name = "Uttam Sah";
        faculty = "BEIT";
        roll = 33;
    }
    public void display()
    {
        System.out.println("Name: " + name + "\nFaculty: " + faculty + "\nRoll No.: " + roll);
    }
    
}
public class Constructor
{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setInfo();
        obj.display();
    }
}