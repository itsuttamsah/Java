class forEachLoop
{
    public static void main(String[] args) {
        int Numbers[] = {4, 5, 1, 15};
        int sum = 0;
        for(int num : Numbers)
        {
            sum = sum + num;
        }
        float average = (float)sum/Numbers.length;
        System.out.println("Sum of numbers is " + sum);
        System.out.println("The average of numbers are " + average);
    }
}