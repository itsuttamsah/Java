class Students
{

    public Students() {
        System.out.println("This hold the details of Students:");
    }
    public Students(String name, int roll)
    {
        this();
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + roll);
    }
    public static void main(String[] args) {
        Students obj = new Students("Uttam", 241533);
    }
    
}