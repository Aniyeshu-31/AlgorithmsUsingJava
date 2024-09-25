package com.company;

import java.util.Scanner;
class heapdatastructure {
    private int[] arr;
    private int maxSize;
    private int heapSize;

    public heapdatastructure(int mx) {
        maxSize = mx;
        heapSize = 0;
        arr = new int[maxSize];
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public boolean insert(int ele) {
        if (heapSize + 1 == maxSize)
            return false;
        arr[++heapSize] = ele;
        int pos = heapSize;
        while (pos != 1 && ele > arr[pos / 2]) {
            arr[pos] = arr[pos / 2];
            pos /= 2;
        }
        arr[pos] = ele;
        return true;
    }

    public int remove() {
        int parent, child;
        int item, temp;
        if (isEmpty())
            throw new RuntimeException("Error : Heap empty!");
        item = arr[1];
        temp = arr[heapSize--];
        parent = 1;
        child = 2;
        while (child <= heapSize) {
            if (child < heapSize && arr[child] < arr[child + 1])
                child++;
            if (temp >= arr[child])
                break;
            arr[parent] = arr[child];
            parent = child;
            child *= 2;
        }
        arr[parent] = temp;
        return item;
    }
    public void displayHeap()
    {
        System.out.print("\nHeap array: ");
        for(int i = 1; i <= heapSize; i++)
            System.out.print(arr[i] +" ");
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Heap Test\n\n");
        System.out.println("Enter size of heap");
        heapdatastructure h = new heapdatastructure(scan.nextInt() );
        System.out.println(h.isEmpty());
        h.insert(56);
        h.insert(59);
        h.insert(53);
        h.insert(50);
        h.insert(57);
        h.displayHeap();
        System.out.println(h.remove());
        System.out.println(h.remove());
        h.displayHeap();
        System.out.println(h.isEmpty());
    }
}

