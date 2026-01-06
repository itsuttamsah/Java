class calculate
{
    public void divison(int a, int b) throws ArithmeticException
    {
        int d = a/b;
        System.out.println(d);
    }
}
public class throwsException
{
    public static void main(String[] args) {
        calculate obj = new calculate();
        try
        {
            obj.divison(8, 0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero is not possible");
        }
    }
}