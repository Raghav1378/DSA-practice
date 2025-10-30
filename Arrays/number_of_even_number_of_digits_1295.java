public class number_of_even_number_of_digits_1295 {
   
    public static int  even_number(int number[]) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            int temp = number[i];
            int digit = 0;

            while (temp > 0) {
                temp = temp / 10;
                digit++;

            }
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }
   
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };
        System.out.println(even_number(arr));
    }
}
