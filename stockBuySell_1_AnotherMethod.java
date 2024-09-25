package com.company;

public class stockBuySell_1_AnotherMethod {
    public static void main(String[] args) {
        int i=0;
        int a[]={3,1,4,8,7,2,5};
        int aux[]={0,0,0,0,0,0,0};
        int maxSoFar=a[6];
        int maxProfit=0;
        for(i=6;i>=0;i--)
        {
            aux[i]= Math.max(a[i],maxSoFar);
            maxSoFar=aux[i];
        }
        for(i=0;i<7;i++)
        {
            int profit=Math.abs(aux[i]-a[i]);
            maxProfit=Math.max(profit,maxProfit);
        }
        System.out.println(maxProfit);

    }
}
