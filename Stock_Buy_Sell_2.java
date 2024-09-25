package com.company;

public interface Stock_Buy_Sell_2 {
    public static void main(String[] args) {
        int profit=0;
        int i=0;
        int a[]={5,2,3,1,4,7,9};
        for(i=1;i<7;i++)
        {
            if(a[i]>a[i-1])
            {
                profit+=(a[i]-a[i-1]);
            }
        }
        System.out.println(profit);
    }
}
