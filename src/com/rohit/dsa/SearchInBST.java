package com.rohit.dsa;

public class SearchInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);

        TreeNode leftNode = new TreeNode(1);
        root.left = leftNode;

        TreeNode rightNode = new TreeNode(3);
        root.right = rightNode;

        TreeNode rightOfRightNode = new TreeNode(4);
        rightNode.right = rightOfRightNode;

        int targetValue1 = 5;
        int targetValue2 = 4;

        System.out.println("Target value " + targetValue1 + "exists in Binary Tree -> " + search(root, targetValue1)); // 5 does not exist
        System.out.println("Target value " + targetValue2 + "exists in Binary Tree -> " + search(root, targetValue2)); // 4 exists
    }


    // Time Complexity - O(logn) because half of the side we are avoiding by having BST as the data container.
    // BST should be balanced having 1 node difference is okay
    public static boolean search(TreeNode root, int targetValue) {
        if (root == null) {
            return false;
        }
        else if (targetValue > root.val) {
            return search(root.right, targetValue);
        }
        else if (targetValue < root.val) {
            return search(root.left, targetValue);
        }
        else {
            return true;
        }
    }
}

