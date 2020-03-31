/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {

    public static void main(String[] args) {

        MyBinarySearchTree tree = new MyBinarySearchTree();
        System.out.println("Pre order and post order traversal of Binary Search Tree :");
        tree.insert(17);
        tree.insert(12);
        tree.insert(11);
        tree.insert(26);
        tree.insert(53);
        tree.insert(40);
        tree.insert(31);
        tree.pre_VS_post();
    }
}
