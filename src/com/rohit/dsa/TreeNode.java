package com.rohit.dsa;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;


    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

}
