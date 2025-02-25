package com.company;
import java.util.*;

public class KruskalAlgo {
        static int V = 5;
        static int[] parent = new int[V];
        static int max= Integer.MAX_VALUE;

        static int find(int i)
        {
            while (parent[i] != i)
                i = parent[i];
            return i;
        }

        static void union1(int i, int j)
        {
            int a = find(i);
            int b = find(j);
            parent[a] = b;
        }
        static void kruskalMST(int cost[][])
        {
            int mincost = 0;
            for (int i = 0; i < V; i++)
                parent[i] = i;

            int edge_count = 0;
            while (edge_count < V - 1)
            {
                int min = max, a = -1, b = -1;
                for (int i = 0; i < V; i++)
                {
                    for (int j = 0; j < V; j++)
                    {
                        if (find(i) != find(j) && cost[i][j] < min)
                        {
                            min = cost[i][j];
                            a = i;
                            b = j;
                        }
                    }
                }

                union1(a, b);
                System.out.printf("Edge %d:(%d, %d) cost:%d \n",
                        edge_count++, a, b, min);
                mincost += min;
            }
            System.out.printf("\n Minimum cost= %d \n", mincost);
        }

        public static void main(String[] args)
        {
/* Let us create the following graph
        2 3
    (0)--(1)--(2)
    | / \ |
    6| 8/ \5 |7
    | /     \ |
    (3)-------(4)
            9         */
            int cost[][] = {
                    { max, 2, max, 6, max },
                    { 2, max, 3, 8, 5 },
                    { max, 3, max, max, 7 },
                    { 6, 8, max, max, 9 },
                    { max, 5, 7, 9, max },
            };

            kruskalMST(cost);
        }
    }

