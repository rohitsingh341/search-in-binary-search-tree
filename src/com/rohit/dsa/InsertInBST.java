package com.rohit.dsa;

public class InsertInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        TreeNode leftNode = new TreeNode(3);
        TreeNode leftOfLeftNode = new TreeNode(2);
        leftNode.left = leftOfLeftNode;

        TreeNode rightNode = new TreeNode(6);
        TreeNode rightOfRightNode = new TreeNode(7);
        TreeNode leftOfRightNode = new TreeNode(5);
        rightNode.left = leftOfRightNode;
        rightNode.right = rightOfRightNode;

        root.left = leftNode;
        root.right = rightNode;


        System.out.println("root-> " + root);
        //root-> TreeNode{val=4, left=TreeNode{val=3, left=TreeNode{val=2, left=null, right=null}, right=null}, right=TreeNode{val=6, left=TreeNode{val=5, left=null, right=null}, right=TreeNode{val=7, left=null, right=null}}}

        TreeNode insertedNode = insertNode(root, 8);

        System.out.println("root-> " + root);
        //root-> TreeNode{val=4, left=TreeNode{val=3, left=TreeNode{val=2, left=null, right=null}, right=null}, right=TreeNode{val=6, left=TreeNode{val=5, left=null, right=null}, right=TreeNode{val=7, left=null, right=TreeNode{val=8, left=null, right=null}}}}
    }

    // Time Complexity - O(logn) because in BST we skip half of the traversal.
    public static TreeNode insertNode(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        else if (val > root.val) {
            root.right = insertNode(root.right, val);
        }
        else if (val < root.val) {
            root.left = insertNode(root.left, val);
        }
        return root;
    }
}

