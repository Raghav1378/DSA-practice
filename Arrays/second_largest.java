public class second_largest {
 
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The number at index " + i + " is " + arr[i] + "");
        }
    }
    
//So here in this 
    public static void second_max(int arr[]) {
        
        if (arr.length == 0) {
            System.out.println("The list is empty");
            return;
        }
        
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
         
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                second_largest = largest;
                largest = arr[i];

            }

            else if (second_largest < arr[i] && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
       
        System.out.println("The largest element in the list is"+largest);
        System.out.println("The second largest element in the list is "+second_largest);
    }

    public static void main(String []args) {
     
        int arr[] = { 12, 32, 42, 23 };
        // print(arr);
        second_max(arr);
    }
}
