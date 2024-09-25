package RecursionFromScratch;
import java.util.*;
public class LongestPalindromicSubsequence {
    public static String reverse(String s){
        String w="";
        for(int i=0;i<s.length();i++){
            w=s.charAt(i)+w;
        }
        return w;
    }
    public static int subsequence(String str,String str1, int i,int j,int dp[][]) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (dp[i][j] != -1) return dp[i][j];

        if (str.charAt(i-1) == str1.charAt(j-1)) {
            dp[i][j] = 1 + subsequence(str, str1, i - 1, j - 1, dp);
        } else {
            dp[i][j] = Math.max(subsequence(str, str1, i - 1, j, dp), subsequence(str, str1, i, j-1, dp));
        }
        return dp[i][j];
    }
    public static void main(String[] args) {
       String s1="";
       Scanner sc=new Scanner(System.in);
       s1=sc.next();
       String s2= reverse(s1);
       int n=s1.length();
       int m=s2.length();
       int dp[][]=new int[n+1][n+1];
      for(int i=0;i<=n;i++){
          for(int j=0;j<=n;j++){
              dp[i][j]=-1;
          }
      }
        System.out.println(subsequence(s1,s2,n,m,dp));

    }
}
