
public class max_consequtive_ones {

    static void max_consequtive(int arr[]) {
        int count = 0;
        int max = 0;

        if (arr.length == 0) {
            System.out.println("The array is empty");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {

                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1 };
        max_consequtive(arr);
    
    }
}