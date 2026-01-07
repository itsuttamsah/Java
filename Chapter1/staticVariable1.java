class Student
{
    String name;
    int roll;
    static String Faculty;

    public Student(String name, int roll, String Faculty) 
    {
        this.name = name;
        this.roll = roll;
        this.Faculty = Faculty;
    }

    

    public void Show()
    {
        System.out.println("Name: " + name + "\nRoll No.: " + roll + "\nFaculty: " + Faculty);
    }
}
public class staticVariable1
{
    public static void main(String[] args) {
        Student obj1 = new Student("Uttam Sah", 241533, "BEIT");
        Student obj2 = new Student("Ujawal Jaiswal", 241527, "BEIT");

        obj1.Faculty = "BEIT 2025";

        obj1.Show();
        obj2.Show();
    }
}