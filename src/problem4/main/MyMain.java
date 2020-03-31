/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String args[]) {
        MyBinarySearchTree obj = new MyBinarySearchTree();

        System.out.println("queue to store pre-order successor of all the nodes of given binary search tree is : ");
        obj.insert(12);
        obj.insert(31);
        obj.insert(32);
        obj.insert(14);
        obj.insert(23);
        obj.insert(10);
        obj.insert(17);

        MyQueue mq = new MyQueue();
        mq.preSuccessor(obj.getroot());
        mq.getPreSucc();
    }


}