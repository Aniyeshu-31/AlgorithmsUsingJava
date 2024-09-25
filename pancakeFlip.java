package com.company;
import java.util.*;
public class pancakeFlip {
    static int findmax(int arr[],int n){
        int max=0;
        int i=0;
        for(i=1;i<n;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static boolean isSorted(int arr[]){
        int i=0,j=0;
        int flag=0;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=1;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
    static void reverse(int arr[], int k,int n , ArrayList<Integer>ans){
        int i=0;
        for(i=0;i<k/2;i++){
            int temp=arr[i];
            arr[i]=arr[k-i-1];
            arr[k-i-1]=temp;
        }
        ans.add(k);
    }

    public static void main(String[] args) {
                int k;
                int i=0;
                ArrayList<Integer> ans=new ArrayList<Integer>();
                // sc=new Scanner(System.in);
                int arr[]={3,2,5,4,1};
                int l=arr.length;
                while(isSorted(arr)){
                    k=findmax(arr,l)+1;
                    reverse(arr,k,l,ans);
                    reverse(arr,l,l,ans);
                    l--;
                }
                for(i=0;i<ans.size();i++){
//                    System.out.println(ans.size());
                    System.out.print(ans.get(i)+" ");

                }
            }
        }

