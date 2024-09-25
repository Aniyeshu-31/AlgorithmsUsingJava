package recursion;

public class countingNumbers_recursion{
    static void count(int n)
    {
        if(n<1)
        return;

        count(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        int n=8;

         count(n);
    }
}
