package recursion;

import java.util.Scanner;

public class NQueen {
    public static boolean isSafe(int board[][],int row, int col, int n )
    {
        int i=0,j=0;
        //check in row
        for(i=0;i<row;i++)
        {
            if(board[i][col]==1)
            return false;
        }
        i=row;
        j=col;
        // now check for upper diagnal
        while(i>=0 && j>=0)
        {
            if(board[i][j]==1) {
                return false;
            }
            i--;
            j--;
        }
        i=row;
        j=col;
        while(i>=0 && j<n)
        {
            if(board[i][j]==1)
            {
                return false;
            }
            i--;
            j++;
        }
        return true;


    }
    public static boolean NQueen(int board[][], int row,int n)
    {
        if(row>=n)
            return true;
        for(int col=0;col<n;col++)
        {
            if(isSafe(board,row,col,n))
            {
                board[row][col]=1;
                if(NQueen(board,row+1,n))
                {
                    return true;
                }
                System.out.print(row+" "+col);
                board[row][col]=0;      // BackTracking Step

            }
        }
        return false;
    }
    public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int board[][]=new int[n][n];
      for(int i=0;i<n;i++) {
          for (int j = 0; j < n; j++) {
              board[i][j] = 0;
          }
      }
      if(NQueen(board,0,n))
      {
          for(int i=0;i<n;i++) {
              for (int j = 0; j < n; j++) {
                  System.out.print(board[i][j]+" ");
              }
              System.out.println();
          }
      }
    }
}
