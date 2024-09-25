package com.company;
import java.util.*;
public class combination {
    public static void main(String[] args) {
        String word;
        int i=0,j=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the word");
        word=sc.next().toUpperCase();
        int l=word.length();
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                for(k=0;k<l;k++)
                {
                    if(i!=j && j!=k && k!=i)
                    {
                        System.out.println(word.charAt(i)+""+word.charAt(j)+""+word.charAt(k));
                    }
                }
            }
        }
    }
}
