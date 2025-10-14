public class reverse{

    public static void reverse_number(int n){
        int rev=0;
        int orignal=n;

        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        System.out.println("The reverse of the number is "+orignal+ "is"+rev);
    }
    public static void main(String[] args) {
        reverse_number(51);
        
    }
}