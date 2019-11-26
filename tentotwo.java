import java.util.*;
public class tentotwo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans = "";
        while (a > 0) {
            int b = a%2;
            a = a/2;
            ans = b + ans;
        }
        System.out.println(ans);
    }
}
