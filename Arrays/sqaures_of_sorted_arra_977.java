public class sqaures_of_sorted_arra_977 {
    
    public static void sorted_sq(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];

        }
        
        for (int p = 0; p < arr.length; p++) {
            for (int j = p + 1; j < arr.length; j++) {
                if (arr[j] < arr[p]) {
                    int temp = arr[p];
                    arr[p] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[p]);
        }
        
  }
    public static void main(String[] args) {
        int n[]={ -4, -1, 0, 3, 10 };
        sorted_sq(n);
    }
    }

