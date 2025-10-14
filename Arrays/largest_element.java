class main{
    
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The number at index " + i + " is " + arr[i] + "");
        }
    }
    

    public static void max(int arr[]) {
 
        if (arr.length == 0) {
            System.out.println("The list is empty");
            return;
        }

        int max = arr[0];        
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println("The max element in the list is "+max);
    }

    public static void main(String[] args) {
        
        int arr[] = { 1, 2, 3, 232312, 4, 5, 3434, 2312, 23 };
        int arr2[] = {};
        // print(arr);

        max(arr);
        max(arr2);
    }
}