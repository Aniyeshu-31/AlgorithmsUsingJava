package com.company;
import java.util.*;
public class n {
    public static void main(String[] args) {
        String ans = "";
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        char[] arr = s.toCharArray();
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if(visited[i]){
                continue;
            }

            int count = 1;
            for (int j = i+1; j < n; j++) {
                if(arr[j] == arr[i]){
                    visited[j] = true;
                    count++;
                }
            }

            if(count == 1){
                ans += arr[i] + " ";
            }
        }
        System.out.println(ans);


    }
}
