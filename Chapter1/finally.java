public class finally
{
    public static void main(String[] args) {
        int i = 0; 
        int j = 0;
        int num[] = {1,2,3,4,5};
        
        try 
        {
            System.out.println(num[10]);
            j = 18 / i;
            System.out.println(j);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Element is out of index of array.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("We cannot divide any number by zero." +e);
        }
        finally
        {
            System.out.println("We are in final steps in this chapter1.");
        }
    }
}