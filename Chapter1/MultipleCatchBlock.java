public class MultipleCatchBlock
{
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int num[] = {1, 4, 5, 6};
        String str = null;

        try {
            j = 18 / i;
            System.out.println(num[7]);
            System.out.println(str.length());
            
        } catch (ArithmeticException e) 
        {
            System.out.println("A number is not divisble by zero " +e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array is out of range. ");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong. " +e);
        }
        System.out.println(j);
    }
}