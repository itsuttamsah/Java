class Students
{
    void show()
    {
        System.out.println("Out of this: " +this);
    }
    public static void main(String[] args) {
        Students A = new Students();
        System.out.println("Output of object: "+A);
        A.show();
    }
}