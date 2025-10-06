
public class print_divisor {
    static void get_divisor(int n) {
        int count=0;
        for (int i = 1; i <= n; i++) {
            
            if (n % i == 0) {
                System.out.println("the divisor are " + i);
                count++;
            }
        }
        
        System.out.println("the total number of the divisor are" + count);

    }

    public static void main(String[] args) {
        get_divisor(4);
    }
}
