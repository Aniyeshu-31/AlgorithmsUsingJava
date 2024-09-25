package com.company;
import java.util.*;
class input {
    static Scanner sc=null;
    static void input(int arr[],int n){
        sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
   static int isSorted(int arr[]){
        int i=0,j=0;
        int flag=0;
        int min=0;
        for(i=0;i<=arr.length-1;i++){
            min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]>arr[min]){
                    flag=1;
                }
            }
        }
       if(flag==1)
           return 1;
       else
           return 0;
    }
    static void reverse(int arr[], int k){
        int i=0;
        for(i=0;i<k/2;i++){
            int temp=arr[i];
            arr[i]=arr[k-i-1];
            arr[k-i-1]=temp;
        }
    }

    public static void main(String[] args) {
        int k;
        int i=0,n,arr[];
        ArrayList<Integer> list=new ArrayList<>();
        sc=new Scanner(System.in);
        System.out.println("Input the size of the array");
        n=sc.nextInt();
        arr=new int[n];
        input(arr,n);
        Random r=new Random();
        while(isSorted(arr)==0){
            k=r.nextInt(0,n-1);
            System.out.println(k);
            reverse(arr,k);
            list.add(k);
        }
        for(i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
            System.out.println(list.size());
        }
    }
}