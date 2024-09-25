package com.company;

public class stocks_buy_sell_1 {
    public static void main(String[] args) {
        int a[]={3,5,1,7,4,9,3};
        int maxprofit=0;
        int minSofar=a[0];
        for(int i=0;i<7;i++)
        {
            minSofar=Math.min(minSofar,a[i]);
            int profit=a[i]-minSofar;
            maxprofit=Math.max(maxprofit,profit);
        }
        System.out.println(maxprofit);
    }
}
