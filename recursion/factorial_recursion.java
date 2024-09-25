package recursion;

public class factorial_recursion {
    static int factorial(int n)
    {
        if(n==1 || n==0)
            return 1;
//        {
//            return 1;
//        }
//        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(factorial(n));
    }
}

