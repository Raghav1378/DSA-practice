import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want to reverse  ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count = count + 1;
        }
        System.out.println("the number of the digits in the number are " + count);
    }
}