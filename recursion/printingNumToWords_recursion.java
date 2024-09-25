package recursion;

public class printingNumToWords_recursion {
    static  void  NumtoWords(int n) {
        String str[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (n == 0)
            return ;
         NumtoWords(n / 10);
        int d=n%10;
        System.out.println(str[d]);
    }

    public static void main(String[] args) {
        int n=123;
        NumtoWords(n);

    }
}
