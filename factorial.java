import java.util.Scanner;

public class factorial {

    static void factorial(int n) {
        int value=1;
        if (n == 0) {
            System.out.println("The value of the factorial in case of 0 is 1");
            return;
        }
        for (int i = n; i >= 1; i--) {
            value *= i;

        }
        
        System.out.println("the value of the factorail is " + value);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLease enter the number you want the factorail of");
        int n=sc.nextInt();
        factorial(n);
    }
}
