package com.company;
import java.util.*;
public class tripQues {
    ArrayList<Integer> min=new ArrayList<Integer>();
    static void DFS(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>dfs,boolean vis[],int node)
    {
        dfs.add(node);
        vis[node]=true;
        for(int it:adj.get(node)) {
            if (vis[it] == false) {
                DFS(adj, dfs, vis, it);
            }

        }
    }
    static ArrayList<Integer> DFSofGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> dfs=new ArrayList<Integer>();
        boolean vis[]=new boolean[V+1];
        int i=0,components=0;
        for(i=1;i<=V;i++){
            if(vis[i]==false) {
                DFS(adj, dfs, vis, i);
                components++;
            }
        }
        System.out.println("The number of components are => "+components);
        return dfs;
    }
    static void insert(ArrayList<ArrayList<Integer>> adj,int V, int u ,int v,int weight){
        int i=0;
        for(i=1;i<=V;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int V=0;
        Scanner sc=new Scanner(System.in);
        V=sc.nextInt();
        boolean vis[]=new boolean[V+1];
        insert(adj,V,1,2,30);
        insert(adj,V,2,1,30);
        insert(adj,V,1,3,15);
        insert(adj,V,3,1,15);
        insert(adj,V,1,4,10);
        insert(adj,V,4,1,10);
        insert(adj,V,2,4,25);
        insert(adj,V,4,2,25);
        insert(adj,V,2,5,60);
        insert(adj,V,5,2,60);
        insert(adj,V,3,4,40);
        insert(adj,V,4,3,40);
        insert(adj,V,4,7,35);
        insert(adj,V,7,4,35);
        insert(adj,V,3,6,20);
        insert(adj,V,6,3,20);
        insert(adj,V,6,7,30);
        insert(adj,V,7,6,30);
        System.out.println(DFSofGraph(V,adj));
    }
}
