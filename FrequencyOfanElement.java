package com.company;
import java.util.*;
public class FrequencyOfanElement {
 static int ans=0;
    static int divide(int arr[],int n,int l,int h,int key) {
                          if(l<h){
                      int mid=(l+h)/2;
                      divide(arr, n, l, mid,key);
                      divide(arr, n, mid+1,h,key);
                      ans+=countf(arr,l,h,mid,key);
                  }
                 return ans;
              }
              static int countf(int arr[],int l,int h,int mid,int key){
                  int larr[] = new int[mid - l+1];
                  int freq=0;
                  int ll = mid - l + 1;
                  int rr = h - mid;
                  int k=l;
                  int rarr[] = new int[h - mid];
                  int i = 0;
                  int j = 0;
                  for (i = 0; i <ll; i++) {
                      larr[i] = arr[k];
                      k++;
                  }
                  for (i=0; i < rr; i++) {
                      rarr[i] = arr[k];
                      k++;
                  }
                  if(larr.length==1 && larr[0]==key){
                      freq++;
                  }
                  if(rarr.length==1 && rarr[0]==key){
                      freq++;
                  }
                  return freq;
              }

    public static void main(String[] args) {
        int n,key=4,ans=0;
        int arr[]=new int[10];
        Random r=new Random();
        n=arr.length;
        for(int i=0;i<10;i++){
            arr[i]=r.nextInt(0,10);
        }
//        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The Frequency of Key : "+key+" is "+divide(arr,n,0,n-1,key));
        System.out.println();

    }
}
