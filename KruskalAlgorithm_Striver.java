package com.company;
import java.util.*;
class cNode{
    private int u;
    private int v;
    private int weight;
    cNode(int u1,int v1,int w1){
        u=u1;
        v=v1;
        weight=w1;
    }
    cNode(){}
    int getV(){return v;}
    int getU(){return u;}
    int getWeight(){
        return weight;
    }
}
class SortComparator implements Comparator<cNode> {
    @Override
    public int compare(cNode node1, cNode node2) {
        if (node1.getWeight() < node2.getWeight())
            return -1;
        if (node1.getWeight() > node2.getWeight())
            return 1;
        return 0;
    }
}

public class KruskalAlgorithm_Striver {
    private int  findpar(int u,int parent[]){
        if(u==parent[u])return u;
        return findpar(parent[u],parent);
    }
    public void union(int u,int v,int parent[],int rank[]){
        u=findpar(u,parent);
        v=findpar(v,parent);
        if(rank[u]<rank[v]) {
            parent[u] = v;
        }
            else if(rank[v]<rank[u]){
                    parent[v]=u;
            }
            else{
                parent[v]=u;
                rank[u]++;
        }
    }
    void KruskalALgo(ArrayList<cNode> adj,int N){
        Collections.sort(adj,new SortComparator());
        int parent[]=new int[N];
        int rank[]=new int[N];
        for(int i=0;i<N;i++){
            parent[i]=i;
            rank[i]=0;
        }
        int cosMst=0;
        ArrayList<cNode> mst=new ArrayList<cNode>();
        for(cNode it: adj){
            if(findpar(it.getU(),parent)!= findpar(it.getV(),parent));{
                cosMst+=it.getWeight();
                mst.add(it);
                union(it.getU(),it.getV(),parent,rank);
            }
        }
        System.out.println(cosMst);
        for(cNode it:mst){
            System.out.println(it.getU()+"  "+ it.getV());
        }
    }
    public static void main(String[] args) {
         int n=5;
         ArrayList<cNode> adj=new ArrayList<cNode>();
         adj.add(new cNode(0,1,2));
         adj.add(new cNode(0,3,6));
         adj.add(new cNode(1,3,8));
         adj.add(new cNode(1,2,3));
         adj.add(new cNode(1,4,5));
         adj.add(new cNode(2,4,7));

         KruskalAlgorithm_Striver obj=new KruskalAlgorithm_Striver();
         obj.KruskalALgo(adj,n);
    }
}
