package com.company;

public class minimum_number {


    static int solve(int arr[],int n){
        int ans = 0;
        int index = -1;


        for(int i =0;i<n;i++){
            int k = i;
            int p = index;
            int sum = 0;
            while(k<n){
                sum = sum+ arr[k];
                if(sum >0){
                    index = k;
                }
                k++;
            }
            if(index!=p){
                ans++;
                i = index + 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,-4};
        int k = solve(arr,4);
        System.out.println(k);
    }
}