import java.util.Scanner;

class Test3
{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.err.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.err.println("Enter the first number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter an operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);

        double result = 0.0;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0)
                {
                    System.out.println("Error: Division by Zero is not allowed");
                    validOperation = false;
                }
                else
                {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid operation. ");
                validOperation = false;
        }
        if(validOperation){
            System.out.println("Result: " + result);
        }
    }
}