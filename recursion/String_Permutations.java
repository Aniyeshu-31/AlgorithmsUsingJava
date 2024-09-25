package recursion;
import java.util.*;
public class String_Permutations {
    static void powerSet(String s,int i,String cur) {
        if (i == s.length()) {
            System.out.print(cur+" , ");
            return;

        }
        powerSet(s, i + 1, cur + s.charAt(i));
        powerSet(s, i + 1, cur);
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str;
            String w=" ";
            str=sc.next();
            int i=0;
            powerSet(str,i,w);

    }

}
