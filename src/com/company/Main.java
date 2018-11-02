package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree tree = new Tree();
        tree.insertNode(10);
        tree.insertNode(5);
        tree.insertNode(3);
        tree.insertNode(7);
        tree.insertNode(15);
        tree.insertNode(13);
        tree.insertNode(17);
        tree.preorderTraversal();
        tree = tree.deleteNode(10);
        System.out.println();
        tree.preorderTraversal();
    }
}
