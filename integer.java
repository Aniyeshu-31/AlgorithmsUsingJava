package com.company;

public class integer {
    public static void main(String[] args) {
        long L=1,R=10;
        long i=0 , c=0,k=0,j=0;
        for(i=L;i<=R;i++)
        {

            for(j=1;j<=i;j++)
            {

                if(i % j==0)
                {
                    c++;

                }
            }
            if(c==3)
            {
                k++;
                c=0;
            }
            else
            {
                c=0;
            }


        }
        System.out.println((int)k);


    }
    }

