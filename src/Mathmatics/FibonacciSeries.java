import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter a number till you wants to print the series ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printFibo(n);
    }
    static void printFibo(int n)
    {
        if (n<0) return;
        int a = 0;
        int b = 1;
        int c ;
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            c = a+b;
            a=b;
            b=c;
        }
    }
}
