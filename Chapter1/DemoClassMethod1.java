import java.util.Scanner;

class Student{
    Scanner sc = new Scanner(System.in);
    String name, faculty;
    int roll;
    public void setInfo()
    {
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();
        System.out.print("Enter Your Faculty: ");
        faculty = sc.nextLine();
        System.out.print("Enter Your Roll No.: ");
        roll = sc.nextInt();
    }
    public void display()
    {
        System.out.println("Display Student Details:");
        System.out.println("Name: " + name);
        System.out.println("faculty: " + faculty);
        System.out.println("Roll No.: " + roll);
    }
        
}
public class DemoClassMethod1 
{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setInfo();
        obj.display();
    }
}