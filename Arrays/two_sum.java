public class two_sum {



    public static void two_sum(int arr[], int target) {
        int n = arr.length;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("yippe");
                    break;
                }
                else {
                    System.out.println("didnt found");
                }
            }
            
        }

    }

    public static void main(String[] args) {
        int target = 12;
        int arr[] = { 5, 36, 3, 7, 42, 25,6,6 };
        two_sum(arr, target);
    }
}