class Students
{
    String name;
    int roll;

    public Students(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public void show(){
        System.out.println("Name : " +this.name);
        System.out.println("Roll No.: " + this.roll);
    }
    public static void main(String[] args) {
        Students obj = new Students("Uttam Sah", 241533);
        obj.show();
    }
    
}