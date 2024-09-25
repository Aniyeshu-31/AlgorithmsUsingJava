package com.company;
import java.util.*;
public class Clique
{
    static int []t = new int[10];        // This will Store the vertices of the Graph
    static int n;
    static int [][]g = new int [10][10];     // Adjacency Matrix of the graph
    static int []d = new int[10];           // This array will store Degree of vertices of the Graph
    static boolean isclique(int b)        // defining the boolean isclique function to check whether there is a valid clique or not
    {
        for (int i = 1; i < b; i++)
        {
            for (int j = i + 1; j < b; j++)
                if (g[t[i]][t[j]] == 0)        // main if condition that checks whether there is a valid clique or not
                    return false;
        }
        return true;
    }
    static void print(int n)              // Here is the Printing function that will print the Clique
    {
        for (int i = 1; i < n; i++)
            System.out.print(t[i] + " ");
        System.out.print(", ");
    }
    static void RepresentCliques(int i, int l, int s) // Main Represent Clique function
    {
        for (int j=i+1; j<=n-(s-l);j++)
            if (d[j]>=s-1)
            {
                t[l]=j;
                if (isclique(l+1))
                    if (l<s)
                        RepresentCliques(j,l+1, s);     // Here we are calling the RepresentClique Function that will be a recursive call to find the Clique
                    else
                        print(l+1);
            }
    }
    public static void main(String[] args)
    {
        int ed[][] =                         // Here ed[][] are edges
                { { 1, 3 },
                { 4, 5 },
                { 7, 6 },
                { 9, 8 },
                { 3, 6 },                      // This is the Dummy Graph edges that we have taken to calculate its Clique
                { 5, 3 },
                { 6, 8 }},
                k = 2;                         // Here we have taken a dummy order K=2
        int len= ed.length;       // Size of the edges
        n = 6;
      for (int i = 0; i<len; i++)
        {
            g[ed[i][0]][ed[i][1]] = 1;
            g[ed[i][1]][ed[i][0]] = 1;
            d[ed[i][0]]++;
            d[ed[i][1]]++;
        }

        System.out.println("The Cliques of the Graph of order K is :- ");

        RepresentCliques(0, 1, k);    // Final Function call that will print the Clique at the end of order k of undirected Graph
    }
}