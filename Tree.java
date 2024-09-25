package com.company;
import java.util.*;
class BinaryNode{
    BinaryNode left, right;
    int data;

    public BinaryNode(int data) {
        this.data = data;
    }
}
public class Tree {
    static int count=0;
    static Scanner sc=null;
        static BinaryNode createTree() {
            BinaryNode root = null;
            System.out.println("Enter data:- ");
            int data = sc.nextInt();
            if (data == -1)
                return null;
            root = new BinaryNode(data);

            System.out.println("Enter data for the left:- " + data);
            root.left = createTree();
            System.out.println("Enter data for the right:- " + data);
            root.right = createTree();
            return root;
        }
        static void Inorder(BinaryNode root){
            if(root==null)
                return;
            Inorder(root.left);
            System.out.print(root.data+"->");
            Inorder(root.right);
        }
  static  public int pathSum(BinaryNode root, int sum) {
    if (root == null) return 0;
    return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

   static public int pathSumFrom(BinaryNode node, int sum) {
        if (node == null) return 0;
        return (node.data == sum ? 1 : 0)
                + pathSumFrom(node.left, sum - node.data) + pathSumFrom(node.right, sum - node.data);
    }
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        BinaryNode root=createTree();
//        Inorder(root);
        System.out.println();
        int sum=pathSum(root,10);
        System.out.println(sum);
    }
    }




