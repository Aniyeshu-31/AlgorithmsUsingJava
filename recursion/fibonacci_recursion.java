package recursion;

public class fibonacci_recursion {
    static int  fibo(int n)
    {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        int n=9;
        System.out.println(fibo(n));
    }
}
