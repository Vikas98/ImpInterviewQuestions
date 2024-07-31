import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number which you wants to reverse: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println("Reverse of "+n+ " is "+ reverse(n));
    }
    static int reverse(int n)
    {
        int rev = 0;
        while (n>0)
        {
            int rem = n%10;
            rev = rev*10 + rem;

            n = n/10;
        }
        return  rev;
    }
}
