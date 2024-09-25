package recursion;
import java.util.*;
public class sortingArray {
    static boolean sorting(int a[], int i)
    {
        int l = a.length;
        if (i == l)
            return true;
        if (a[i] < a[i - 1])
            return false;
        return sorting(a, i + 1);
    }
    public static void main(String[] args) {
        int a[], n, i = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean check = sorting(a, 1);
        System.out.println(check);
    }
}