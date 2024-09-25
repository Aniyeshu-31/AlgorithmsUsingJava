package com.company;

public class heapsort {
    void swap(int arr[],int i, int largest){
        int temp=arr[i];
        arr[i]=arr[largest];
        arr[largest]=temp;

    }
    void heapify(int arr[], int n, int i){
        int largest=i;
        int l=2*i;
        int r=2*i+1;
        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }
    void buildheap(int arr[],int n){
        for(int i=n/2;i>0;i--){
            heapify(arr,n,i);
        }

    }
    void heapsort(int arr[],int n){
        for(int i=n-1;i>1;i--){
            swap(arr,1,i);
            heapify(arr,i-1,1);
        }
    }
    public static void main(String[] args) {
         int arr[]={10,30,50,20,35,15};
         heapsort h=new heapsort();
         h.buildheap(arr,6);
         h.heapsort(arr,6);
         for(int i=0;i<6;i++){
             System.out.print(arr[i]+" ");
         }
    }
}
