package com.company;
import java.util.Scanner;
public class matrix_inverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m[][];
        m=new int[3][3];
        int i=0,j=0;
        for(i=0;i<m.length;i++)
        {
            for(j=0;j<m.length;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m.length;i++)
        {
            for (j = 0; j < m.length; j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        int x= (m[0][0]) * ((m[2][2]*m[1][1])-(m[1][2]*m[2][1]));
        int y= (m[0][1]) *((m[1][0]*m[2][2])-(m[1][2]*m[2][0]));
        int z= (m[0][2]) *((m[1][0]*m[2][1])-(m[1][1]*m[2][0]));
        int det=(x)-(y)+(z);
        System.out.println("the determinant of a 3*3 matrix is:");
        System.out.println(det);
    }
}
