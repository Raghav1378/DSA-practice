public class left_rotate {

    public static void rotate_array(int arr[], int n) {
        //First thing that i would be doing here is that i would create a temporary array that would be the size of the same as the number of the times we have to rotate it 

        int temp[] = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n-1]=arr[0];
        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        int arr[] = { 1, 2, 3, 4, 5 };
        rotate_array(arr, n);
    }

}
