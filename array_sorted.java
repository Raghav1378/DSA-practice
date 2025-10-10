public class array_sorted {

    public static void array_sorted(int arr[]) {
        if (arr.length == 0) {
            System.out
                    .println("The arrays is empty please fill this before checking whether the array is sorted or not");
        }
        
        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5,32};
        array_sorted(arr);
    }
}
