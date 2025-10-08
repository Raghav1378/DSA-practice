import java.util.HashSet;

public class remove_dupilcate {

    public static void remove_dupilcate(int arr[]) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);

        }
    

    public static void main(String[] args) {
        int arr[] = { 1212, 42, 1241, 231, 1212, 1241 };

        remove_dupilcate(arr);
    }
}
