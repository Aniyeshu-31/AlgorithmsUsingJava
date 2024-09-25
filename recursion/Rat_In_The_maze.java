package recursion;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Rat_In_The_maze {
   static boolean isSafe(int arr[][], int x, int y, int n) {
        if (x < n && y < n && arr[x][y] == 1) {
            return true;
        }
        return false;
    }

  static   boolean ratInMaze(int arr[][], int x, int y, int n, int sol[][]) {
       if(x==n-1 && y==n-1 )
       {
           sol[x][y]=1;
           return true;
       }
        if (isSafe(arr, x, y, n)) {
            sol[x][y] = 1;
            if (ratInMaze(arr, x, y + 1, n, sol)) {
                return true;
            }
            if (ratInMaze(arr, x + 1, y, n, sol)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int arr[][],n,x=0,y=0,solarr[][];
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n][n];
        solarr=new int[n][n];
        for(i=0;i<n;i++)
        {

            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
      for(i=0;i<n;i++)
      {

          for(j=0;j<n;j++)
          {
              solarr[i][j]=0;
          }
      }
        if(ratInMaze(arr,0,0,n,solarr))
        {
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(solarr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
//  1 0 1 0 1
//  1 1 1 1 1
//  0 1 0 1 0
//  1 0 0 1 1
//  1 1 1 0 1