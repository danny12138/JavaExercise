package com.study.oo.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopTreeNodeNoList {
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
    static int[] preorderA = new int[1000000];
    static int[] inorderA = new int[1000000];
    static int[] postorderA = new int[1000000];
    static int index ,index2 ,index3 = 0;

    public static int[][] threeOrders (TreeNode root) {
        traverseTree(root);
        return new int[][]{Arrays.copyOf(preorderA,index),Arrays.copyOf(inorderA,index),Arrays.copyOf(postorderA,index)};
    }
    public static void traverseTree(TreeNode t){
        if (t != null){
            preorderA[index] = (t.val);
            index++;
            System.out.println(t.val +" "+ index);
            traverseTree(t.left);
            inorderA[index2] = (t.val);
            index2++;
            traverseTree(t.right);
            postorderA[index3] = (t.val);
            index3++;
        }
    }
}



