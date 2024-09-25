package com.company;
import java.util.*;
public class Single_occuring_characters {
    public static void main(String[] args) {
        String s;int c=0,c1=0;
        int l,i=0,j=0;
        char ch[];
        String res=" ";
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        ch=s.toCharArray();
        l=ch.length;
        boolean visit[]=new boolean[l];
        Arrays.fill(visit , false);
        for(i=0;i<l;i++)
        {
            if(visit[i])
            {
                continue;
            }
           c=1;
            for(j=i+1;j<l;j++)
            {
                if(ch[i]==ch[j])
                {
                    visit[j]=true;
                    c++;
                }

            }
            if(c==1)
                res= ch[i]+"";
        }
        System.out.println(res);

    }
}
