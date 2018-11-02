package com.company;

import java.util.ArrayList;

public class Tree {
    private TreeNode root;

    Tree(){root = null;}

    public void insertNode(int data){
        if(root == null){
            root = new TreeNode(data);
        }else{
            root.insert(data);
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean search(int data){
        ArrayList arrayList = new ArrayList();
        convertHelper(arrayList, root);
        if(arrayList.contains(data)){
            return true;
        }else{
            return false;
        }
    }

    //root - left - right
    public void preorderTraversal(){
        preorderHelper(root);
    }

    private void preorderHelper(TreeNode node) {
        if(node == null){
            return;
        }
        System.out.println(node.getData());
        preorderHelper(node.getLeftNode());
        preorderHelper(node.getRightNode());
    }

    //left - root - right
    public void inorderTravrsal(){
        inorderHelper(root);
    }

    private void inorderHelper(TreeNode node) {
        if(node == null){
            return;
        }
        inorderHelper(node.getLeftNode());
        System.out.println(node.getData());
        inorderHelper(node.getRightNode());
    }

    //left - right - root
    public void postorderTraversal(){
        postorderHelper(root);
    }

    private void postorderHelper(TreeNode node) {
        if(node == null){
            return;
        }
        postorderHelper(node.getLeftNode());
        postorderHelper(node.getRightNode());
        System.out.println(node.getData());
    }

    private ArrayList convertHelper(ArrayList arrayList, TreeNode node){
        if(node != null) {
            arrayList.add(node.getData());
            convertHelper(arrayList, node.getLeftNode());
            convertHelper(arrayList, node.getRightNode());
        }
        return arrayList;
    }

    public Tree deleteNode(int data){
        if(search(data)){
            ArrayList<Integer> arrayList = new ArrayList();
            arrayList = convertHelper(arrayList, root);
            arrayList.remove((Integer)data);
            Tree tempTree = new Tree();
            for(int i = 0; i < arrayList.size(); i++){
                tempTree.insertNode(arrayList.get(i));
            }
            return tempTree;
        }else{
            return this;
        }
    }
}
