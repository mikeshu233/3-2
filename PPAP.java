import java.util.*;
public class PPAP{
   public static void mian(String [] args){
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   int a =0;
   int b =0;
   String A = "";
   String B = "";
   if(str.contains("I have a ")){
       a = (str.indexOf("I have a "))+9;
       str = str.substring(a);
       b = str.indexOf("I have a ");
       A = str.substring(0,b-2);
       B = str.substring(b+9);
   }
   System.out.println("Uh! " + A + B);
   }
}