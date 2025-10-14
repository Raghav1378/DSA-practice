

public class number_appear_once {
    
    public static int count_freq(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (num == arr[j]) {
                    count++;
                }
                if (count == 1) {
                    return num;
                }

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int n = count_freq(arr);
        System.out.println("the single element is "+n);
    }
}
