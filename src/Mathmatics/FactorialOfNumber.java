import java.sql.SQLOutput;
import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number for which you wants to calculate factorial ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

       // System.out.println("factorial of "+ n +" is "+factorial(n));

        System.out.println("factorial of "+ n +" is "+factorialRecursive(n)+" using recursive method");
    }
    static int factorial(int n)
    {
        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact = fact*i;
        }
        return fact;
    }
    static int factorialRecursive(int n)
    {
        if(n==1) return  1;
        return n*factorialRecursive(n-1);
    }
}
