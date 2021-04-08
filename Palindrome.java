import java.util.*;
public class Palindrome{
    public static boolean is_palindrome(String s)
    {
     String inverse="";
     int i;
     for(i=(s.length()-1);i>=0;i--) {
       inverse= inverse+ s.charAt(i);
     }
     if(inverse.equals(s)) {
       return true;
     }
     else {
       return false;
     }
    }
}
