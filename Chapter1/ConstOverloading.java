

class Student{
    String name, faculty;
    int roll, room;
    Student()
    {
    }
    Student(String n, String f, int r)
    {
        name = n;
        faculty = f;
        roll = r;
    }
    Student(String n, String f, int r, int rm)
    {
        name = n;
        faculty = f ;
        roll = r;
        room = rm;
    }
    public void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Faculty : " + faculty);
        System.out.println("Roll No.: " + roll);
        System.out.println("Room No.: " + room);
    }
}
public class ConstOverloading
{
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student("Uttam", "BEIT", 33);
        Student obj2 = new Student("Uttam Sah", "BEIT", 33, 305);
        obj1.display();
        obj2.display();
    }
}