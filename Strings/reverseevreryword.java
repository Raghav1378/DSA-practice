package Strings;

public class reverseevreryword {
    
    public static String reverse(String s) {
        String a [] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = a.length-1; i >= 0; i--) {
            sb.append(a[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return (sb.toString());
    }
    public static void main(String[] args) {
        String practice = "Hello this side Raghav";
        String reverse = reverse(practice);
        
    }
}
