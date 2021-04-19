package com.study.oo.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopTreeNode {
    static ArrayList<Integer> preorder = new ArrayList<>();
    static ArrayList<Integer> inorder = new ArrayList<>();
    static ArrayList<Integer> postorder = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode a = new TreeNode();
        TreeNode ab = new TreeNode();
        TreeNode ac = new TreeNode();
        ab.val = 2;
        ac.val = 3;
        a.val = 1;
        a.left = ab;
        a.right = ac;
        int[][] test = threeOrders(a);
        System.out.println(Arrays.toString(test[0]));
        System.out.println(Arrays.toString(test[1]));
        System.out.println(Arrays.toString(test[2]));


    }
    public static int[][] threeOrders (TreeNode root) {
        traverseTree(root);
        int len = preorder.size();
        int[] preorderA = new int[len];
        int[] inorderA = new int[len];
        int[] postorderA = new int[len];

        for (int i = 0; i < len; i++){
            preorderA[i] = preorder.get(i);
            inorderA[i] = inorder.get(i);
            postorderA[i] = postorder.get(i);
        }
        return new int[][]{preorderA,inorderA,postorderA};
    }
    public static void traverseTree(TreeNode t){
        if (t != null){
            preorder.add(t.val);
            traverseTree(t.left);
            inorder.add(t.val);
            traverseTree(t.right);
            postorder.add(t.val);
            }
        }
    }
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

