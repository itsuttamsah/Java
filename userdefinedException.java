class UserDefinedException extends Exception
{

    public UserDefinedException(String str) {
        super(str);
    }
    
}
public class userdefinedException
{
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try 
        {
            j = 18/i;
            if(j==0)
            {
                throw new UserDefinedException("I don't want to print zero.");

            }
        }
        catch(UserDefinedException e)
        {
            j = 18 / 1;
            System.out.println("That is default value " + e);
        }
        System.out.println(j);
    }
}
