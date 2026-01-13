import java.util.Scanner;

class GreaterNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter:");
        int n = sc.nextInt();

        System.out.print("Enter number 1:");
        int max = sc.nextInt();

        for(int i = 2; i<= n; i++)
        {
            System.out.println("Enter number " + i + ":" );
            int num = sc.nextInt();

            if(num > max)
            {
                max = num;
            }
        }
        System.out.println("The greatest number is " + max);
    }
}