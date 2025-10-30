public class running_sum_of_1480 {
    
    

    public static void main(String[] args) {
    
        int []nums = { 1, 2, 3, 4 };
        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            System.out.println(runningSum);
        }
    }
}
