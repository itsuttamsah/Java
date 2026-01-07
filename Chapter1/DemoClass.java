class Student
{
    String name;
    int roll;
    String faculty;
}
public class DemoClass
{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Uttam";
        obj.roll=33;
        obj.faculty = "BEIT";

        System.out.println("Name : " + obj.name);
        System.out.println("Roll No. : " + obj.roll);
        System.out.println("Faculty : " + obj.faculty);

    }
}