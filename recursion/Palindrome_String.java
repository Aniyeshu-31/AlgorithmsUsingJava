package recursion;
import java.util.*;
public class Palindrome_String {
    static boolean isPalin(String s,int l,int r)
    {
        if(l>=r)
            return true;
        if(s.charAt(l)!=s.charAt(r))
            return false;
        else
            return isPalin(s,l+1,r-1);

    }
    public static void main(String[] args)
    {
        int l1,r1;
        String str;
        Scanner sc=new Scanner (System.in);
        System.out.println("Input String and extreme limits");
        str=sc.next();
        l1=sc.nextInt();
        r1=sc.nextInt();
        System.out.println(isPalin(str,l1,r1));
    }
}
