class Student{
    String name, faculty;
    int roll;

    public Student() {
    }

    public Student(String n, String f, int r) {
        name = n;
        faculty = f;
        roll = r;
    }

    public void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Faculty : " + faculty);
        System.out.println("Roll No. : " + roll);
        
    }
}
public class ParaConstructor
{
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student("Uttam Sah", "BEIT", 33);
        obj1.display();
    }
    
}