package com.company;

public class heaps {
     int arr[] = new int[100];
     int size;
     heaps(){
         arr[0] = -1;
         size = 0;
     }
     void swap(int i,int j,int arr[]){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }
     void insert(int element) {
         size = size + 1;
         int ind = size;
         arr[ind] = element;
         while (ind > 1) {
             int parent = ind / 2;

             if (arr[parent] < arr[ind]) {
                 swap(parent,ind,arr);
                 ind = parent;
             } else {
                 return;
             }
         }
     }
     void delete(){
         if(size == 0){
             System.out.println("Nothing to Delete");
         }
         arr[1] = arr[size];
         size--;
         int i = 1;
         while(i < size){
             int leftChild = 2 * i;
             int rightChild = (2 * i) + 1;
             if(leftChild < size && arr[i] < arr[leftChild]){
                 swap(i,leftChild,arr);
                 i = leftChild;
             }else if(rightChild < size && arr[i] < arr[rightChild]){
                 swap(i,rightChild,arr);
                 i = rightChild;
             }
             else{
                 return;
             }
         }
     }
     void heapsort(int[] arr,int n){
         int t = n;
         while(t > 1){
             swap(t-1,1,arr);
             t--;
             heapify(arr,t,1);
         }
     }

     void heapify(int[] arr,int n,int i){
         int largest = i;
         int left = 2 * i;
         int right = (2 * i) + 1;

         if(left < n && arr[largest] < arr[left]){
             largest = left;
         }
         else if(right < n && arr[largest] < arr[right]){
             largest = right;
         }
         if(largest !=  i){
             swap(largest , i , arr);
             heapify(arr,n,largest);
         }
     }
     void print(){
         for(int i=1;i<=size;i++){
             System.out.print(arr[i]+" ");
         }
     }

    public static void main(String[] args) {
              heaps obj = new heaps();
//              obj.insert(50);
//              obj.insert(55);
//              obj.insert(53);
//              obj.insert(52);
//              obj.insert(54);
//
//              obj.print();
//              System.out.println();
//
//              obj.delete();

        int arr[] = {-1,54,53,55,52,50};
        int n =arr.length;
        for(int i = n / 2;i>0;i--) {
            obj.heapify(arr, n, i);
        }
        obj.heapsort(arr,n);   // HeapSort Function
        for(int i = 1;i<n;i++){
             System.out.print(arr[i]+" , ");
        }
//        obj.print();
     }
}
