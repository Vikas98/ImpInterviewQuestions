import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number to check if it is armstrong number or not");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(checkArmstrong(n));

    }
    static boolean checkArmstrong(int n)
    {
        int arm = 0;
        int temp = n;

        while (n>0)
        {
            int rem = n%10;
            arm = arm+(rem*rem*rem);
            n = n/10;
        }
        return arm == temp;
    }
}
