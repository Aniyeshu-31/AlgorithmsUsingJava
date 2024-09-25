package com.company;
public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
    Node root;
    BinarySearchTree() { root = null; }

    BinarySearchTree(int value)
    { root = new Node(value);
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key)
    {


        if (root == null) {
            root = new Node(key);
            return root;
        }


        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);


        return root;
    }


    void inorder() {
        inorderhelp(root);
    }


    void inorderhelp(Node root)
    {
        if (root != null) {
            inorderhelp(root.left);
            System.out.println(root.key);
            inorderhelp(root.right);
        }
    }


    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();


        tree.insert(100);
        tree.insert(48);
        tree.insert(40);
        tree.insert(15);
        tree.insert(88);
        tree.insert(31);
        tree.insert(69);
        tree.inorder();
    }
}