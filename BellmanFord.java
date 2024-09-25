package com.company;
import java.util.*;
public class BellmanFord {
   static  class Pair{
        int u , v ,weight;
        Pair(int _u,int _v ,int _w){
            this.u=_u;
            this.v=_v;
            this.weight=_w;
        }
      int getU(){
            return u;
      }
      int getV(){
            return v;
      }
      int getWeight() {
          return weight;
      }
    }
    public static void input(int u,int v,int weight,ArrayList<Integer> t1){
       t1.add(u);t1.add(v);t1.add(weight);
    }
    public static void bellmanFord(int src,ArrayList<Pair> edges,int N){
        int dis[]=new int[N];
        for(int i=0;i<N;i++){
            dis[i]=10000000;
        }
        dis[src]=0;
        for(int i=1;i<=N-1;i++){
            for(Pair it: edges){
                if(dis[it.getU()]!=10000000 && dis[it.getU()]+it.getWeight()<dis[it.getV()]){
                    dis[it.getV()]=dis[it.getU()]+it.getWeight();
                }
            }
        }
        int flag = 0;
        for(Pair node: edges) {
            if(dis[node.getU()] + node.getWeight() < dis[node.getV()]) {
                flag = 1;
                System.out.println("Negative Cycle");
                break;
            }
        }

        if(flag == 0) {
            for(int i = 0;i<N;i++) {
                System.out.print(  dis[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int V=6;
        Scanner sc=new Scanner(System.in);
        ArrayList<Pair> edges =new ArrayList<Pair>();
        edges.add(new Pair(0,1,5));
        edges.add(new Pair(1,2,-2));
        edges.add(new Pair(2,4,3));
        edges.add(new Pair(3,2,6));
        edges.add(new Pair(3,4,-2));
        edges.add(new Pair(5,3,1));
        edges.add(new Pair(1,5,-3));

        bellmanFord(0,edges,V);

    }
}
