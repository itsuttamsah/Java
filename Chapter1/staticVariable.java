class Student
{
    String name;
    int roll;
    static String Faculty;

    public void Show()
    {
        System.out.println("Name: " + name + "\nRoll No.: " + roll + "\nFaculty: " + Faculty);
    }
}
public class staticVariable
{
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name = "Uttam Sah";
        obj1.roll = 241533;
        obj1.Faculty = "BEIT";

        Student obj2 = new Student();
        obj2.name = "Ujwal Jaiswal";
        obj2.roll = 241527;
        obj2.Faculty = "BBA";

        obj1.Faculty = "BEIT 2025";

        obj1.Show();
        obj2.Show();
    }
}