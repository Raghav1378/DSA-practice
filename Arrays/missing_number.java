public class missing_number {
    
    public static void missing_number(int arr[]) {
        int n = arr.length + 1;
        int expected_sum = n * (n + 1) / 2;
        int actual_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            actual_sum += arr[i];
        }
        int missing_number = expected_sum - actual_sum;
        System.out.println("The missing number is " + missing_number);
        
    }
    
    public static void main(String[] args) {
        int arr[] = {  1, 2, 3, 5,6,7,8};
        missing_number(arr);
    }
}
