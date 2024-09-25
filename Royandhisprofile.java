package com.company;

import java.util.Scanner;

public class Royandhisprofile {
    public static void main(String[] args) {
        int L,N,W[],H[];
        int i=0;
        Scanner sc=new Scanner(System.in);
        L=sc.nextInt();
        N=sc.nextInt();
        W=new int[N];
        H=new int[N];
        for(i=0;i<N;i++)
        {
           W[i]=sc.nextInt();
           H[i]=sc.nextInt();
        }
        for(i=0;i<N;i++)
        {

             if((W[i]>L && H[i]>L)&&(W[i]!=H[i]))
            {
                System.out.println("CROP IT");
            }
             else if((W[i]>L && H[i]<L) || (W[i]<L && H[i]>L))
             {
                 System.out.println("UPLOAD ANOTHER");
             }
             else if((W[i]>L && H[i]==L) && (W[i]<L && H[i]==L) || (H[i]>L && W[i]==L) && (H[i]<L && W[i]==L))
             {
                 System.out.println("CROP IT");
             }

            else if(W[i]<L || H[i]<L)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                System.out.println("ACCEPTED");
            }
        }

    }
}
