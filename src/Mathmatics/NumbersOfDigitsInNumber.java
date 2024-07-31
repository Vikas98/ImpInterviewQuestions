import java.util.Scanner;

public class NumbersOfDigitsInNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number whose digits you wants to count:");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println("Number "+n+" contains "+digits(n)+" digits");
    }
    static int digits(int n)
    {
        int count = 0;
        while (n>0)
        {
            count++;
            n = n/10;
        }
        return count;
    }
}
