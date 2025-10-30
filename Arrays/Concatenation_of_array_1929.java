
import java.util.ArrayList;

public class Concatenation_of_array_1929 {
  
    public static int []concat_array(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            list.add(nums[i]);
        }

        int []result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        int b[] = concat_array(a);
        for (int num : b) {
            System.out.println(num);
        }    
    }
}
