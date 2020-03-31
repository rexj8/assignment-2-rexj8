/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
public class MyMain {
    public static void main(String[] args){
        MyBinarySearchTree tree= new MyBinarySearchTree();
        tree.insert(10);
        tree.insert(96);
        tree.insert(12);
        System.out.println(23);
        tree.insert(73);
        tree.insert(14);
        System.out.println("ALL Left Nodes are:");
        tree.print_left_node();
        System.out.println("Count of all Nodes which are not having left node is: ");
        tree.count_not_left_node();
    }
}