
import java.util.*;


public class remove_duplicates_26 {

    public static void remove_duplicates(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set= new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        Integer[] uniqueArray = set.toArray(new Integer[0]);
        Arrays.sort(uniqueArray);

        for (int num : uniqueArray) {
            System.out.println(num);
        }

     
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2,3,23,4,1,34,2,3,1,2,3,123,1 };
        remove_duplicates(arr);
    }
}
