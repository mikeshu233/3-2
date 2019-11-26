import java.util.*;
public class Piglatin{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (str.length() > 0) {
            int space = str.indexOf(" ");
            if (space < 0) {
                System.out.print(convert(str));
                System.out.println("");
                str = "";
            } else {
                String ans = str.substring(0,space);
                System.out.print(convert(ans) + " ");
                str = str.substring(space+1);
            }
        }
    }
    public static String convert(String str) {
        if (str.length() < 2) {
            return str;
        }
        String a = str.substring(0,1);
        String b = str.substring(1);
        return b + a + "ay";
    }
}