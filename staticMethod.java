class Student
{
    String name;
    int roll;
    static String Faculty;

    public void Show()
    {
        System.out.println("Name: " + name + "\nRoll No.: " + roll + "\nFaculty: " + Faculty);
    }
    public static void showStatic(Student obj)
    {
        System.out.println("Name: " + obj.name + "\nRoll No.: " + obj.roll + "\nFaculty: " + Faculty);
    }
}
public class staticMethod
{
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name = "Uttam Sah";
        obj1.roll = 241533;
        Student.Faculty = "BEIT";

        Student obj2 = new Student();
        obj2.name = "Ujwal Jaiswal";
        obj2.roll = 241527;
        Student.Faculty = "BBA";

        Student.Faculty = "BEIT 2025";

        Student.showStatic(obj1);
        Student.showStatic(obj2);

        System.out.println("Printing Instance Method:");
        obj1.Show();
        obj2.Show();
    }
}