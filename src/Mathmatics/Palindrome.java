import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number for which you wants to check that it is palindrome or not :");

        Scanner scanner = new Scanner(System.in);

        int  n = scanner.nextInt();

        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome( int n)
    {
        int temp = n;
        int rev = 0;
        while (n>0)
        {
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        return temp==rev;
    }
}
