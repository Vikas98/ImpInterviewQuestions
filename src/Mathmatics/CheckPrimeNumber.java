import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(isPrime(n))
        {
            System.out.println(n+" is a prime number ");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }
    static boolean isPrime(int n)
    {
        if (n == 1) return false;
        if (n == 2 || n == 3) return  true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
}
