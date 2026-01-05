import java.util.Scanner;

class doWhileLoop
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Finding sum of n number:");
        System.out.print("Enter a number:");

        int num = sc.nextInt();
        int temp, sum=0, rem;
        temp = num;
        do{
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }while(num!=0);
        System.out.println("The sum of digits of " + temp +" is " + sum);
        sc.close();
    }
    
}