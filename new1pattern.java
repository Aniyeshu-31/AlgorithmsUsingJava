package com.company;
    import java.util.*;
    public class new1pattern {
        public static void main(String args[])
        {
            int n,i=0,j=0,k=0,m=0,a=0,r=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("input the limit");
            n=sc.nextInt();
            int rows=(2*n-1);
            for(i=1;i<=rows;i++)
            {
                if (i<=n)
                {
                for(j=1;j<=(i-1);j++)
                {
                    System.out.print(" ");
                }
                for(k=1;k<=(n-i+1);k++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
                else{
                    for(m=1;m<=(rows-i);m++)
                    {
                        System.out.print(" ");
                    }
                    for(a=1;a<=(i-n+1);a++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();

                    }
                }
        }
    }

