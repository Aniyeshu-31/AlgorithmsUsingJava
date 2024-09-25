package recursion;

import java.util.*;

public class BinarySearch {
    static int binary(int a[],int k,int l,int h)
    {
        if(l>h)
            return -1;
        int mid=(l+h)/2;
        if(a[mid]==k)
            return mid;
        if(k>a[mid])

        return  binary(a,k,mid+1,h);

        else

        return binary(a,k,l,mid-1);

    }
    public static void main(String[] args) {
        int a[],n=0,k=0,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the size of array");
        n=sc.nextInt();
        System.out.println("input the element to check in the array");
        k=sc.nextInt();
        a=new int[n];
        System.out.println("input the elements in the array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println( binary(a,k,0,n-1));

    }
}
