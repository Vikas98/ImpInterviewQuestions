import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number for which you wants to calculate sum of its digits:");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println("Sum of digits of "+n+" is "+sumOfDigits(n));
    }
    static int sumOfDigits(int n)
    {
        int sum = 0;
        while (n>0)
        {
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }
}
