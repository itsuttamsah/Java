import java.util.Scanner;

class whileLoop
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Finding Factorial:");
        System.out.println("Enter a positive number:");

        int num = sc.nextInt();

        int fact=1, temp;
        temp = num;
        while(num!=1)
        {
            fact = fact *num;
            num--;
        }
        System.out.println("The factorial of " + temp +"is "+ fact);
    }
}