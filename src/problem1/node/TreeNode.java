/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

import java.util.Scanner;

class Node

{

    Node left, right;

    int data;


    public Node(int n)

    {

        left = null;

        right = null;

        data = n;

    }

}


class BST

{
    private Node root;

    public BST()

    {

        root = null;

    }

    public void insert(int data)

    {

        root = insert(root, data);

    }

    private Node insert(Node node, int data)

    {

        if (node == null)

            node = new Node(data);

        else

        {

            if (data <= node.data)

                node.left = insert(node.left, data);

            else

                node.right = insert(node.right, data);

        }

        return node;

    }

    public void inorder()

    {

        inorder(root);

    }

    private void inorder(Node r)

    {

        if (r != null)

        {

            inorder(r.left);

            System.out.print(r.data +" ");

            inorder(r.right);

        }

    }

    public void preorder()

    {

        preorder(root);

    }

    private void preorder(Node r)

    {

        if (r != null)

        {

            System.out.print(r.data +" ");

            preorder(r.left);

            preorder(r.right);

        }

    }


}