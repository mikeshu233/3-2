import java.util.*;
public class Palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int a = 0;
        int b = str.length();
        for(int i = 0; i < b; i++){
            char temp1 = str.charAt(i);
            char temp2 = str.charAt(b-1-i);
            if(temp1!=temp2){
                a = 1;
            }
        }
        if(a==0){
            System.out.println("right");
        }
        if(a==1){
            System.out.println("wrong");
        }
    }
}