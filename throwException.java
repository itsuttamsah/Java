class ThrowException
{
    public static void main(String[] args) {
        int i = 20;
        int j= 0;
        try
        {
            j = 18 / i;
            if(j == 0)
            {
                throw new ArithmeticException("I don't want to print zero.");
            }
        }
        catch(ArithmeticException e)
        {
            j = 100;
            System.out.println("Cannot divided by zero" + e);
        }
        System.out.println(j);
    }
}