class Students
{

    public Students() 
    {
        this("Mr.Uttam Sah", 241533);
    }
    Students(String name, int roll)
    {
        System.out.println("Name: " +name);
        System.out.println("Roll No.: "+roll);
    }
    public static void main(String[] args) {
        Students obj = new Students();
    }
    
}