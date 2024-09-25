package RecursionFromScratch;
import java.util.*;
public class primeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Prime(2,n));
    }
    public static boolean Prime(int i,int n){
        if(n==1)return false;
        if(n==2)return true;
        if(n%i==0)return false;
        if(i>=n-1)return true;
       return Prime(i+1,n);
    }
}
