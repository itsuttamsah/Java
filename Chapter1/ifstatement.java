/*class Test1
{
    public static void main(String[] args) {
        int x = 20;

        if(x < 30)
        {
            System.out.println("This is if statement.");
        }

    }

}*/

//We should take input from user also.

import java.util.Scanner;

class Test1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println(num1+ " is greater than " + num2);
        }
        System.out.println("This is an example program if statement.");


    }
}