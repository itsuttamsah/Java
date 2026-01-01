import java.util.Scanner;
//Scanner is a class belong the java.util package.
//It is used for obatining input of primitive types.(int, char etc).
class Test2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //this is a scanner object to read input

        System.out.print("Enter any two numbers to find greater between them: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else{
            System.out.println(num2 + " is greater than " + num1);
        }


    }
}