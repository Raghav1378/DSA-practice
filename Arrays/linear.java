public class linear {

    public static void linear_search(int arr[], int target) {
        int n = arr.length;
        if (n == 0) {
            System.out.println("The array is empty");
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("The element is found at the index of  " + i + "and the number is " + arr[i]);
            }
            
            else {
                System.out.println("The element is not found");
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 5;
        linear_search(arr, target);
    }
}
