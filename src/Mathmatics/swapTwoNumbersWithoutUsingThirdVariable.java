import java.util.Scanner;

public class swapTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        System.out.println("Enter first number:");
        n=scanner.nextInt();
        System.out.println("Enter second number:");
        m=scanner.nextInt();
        System.out.println("number before swap n = "+n+" m = "+m);
//        first way of doing it using operators + and -
//        n= n+m;
//        m = n-m;
//        n = n-m;
//      second way using xor operator
        n = n^m;
        m = m^n;
        n = n^m;
        System.out.println("number after swap n = "+n+" m = "+m);
    }
}
