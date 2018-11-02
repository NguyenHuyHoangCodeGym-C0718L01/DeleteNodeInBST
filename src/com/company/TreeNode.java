package com.company;

public class TreeNode {
    private TreeNode leftNode;
    private int data;
    private TreeNode rightNode;

    TreeNode(int data){
        this.data = data;
        leftNode = rightNode = null;
    }

    public void insert(int data){
        if(data < this.data){
            if(leftNode == null){
                leftNode = new TreeNode(data);
            }else{
                leftNode.insert(data);
            }
        }else if(data > this.data){
            if(rightNode == null){
                rightNode = new TreeNode(data);
            }else{
                rightNode.insert(data);
            }
        }
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
