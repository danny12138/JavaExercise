package com.study.oo.leetcode;

import java.util.LinkedList;

public class Q21 {
    public static void main(String[] args) {
    }

    //    输入：1->2->4, 1->3->4
    //    输出：1->1->2->3->4->4
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        ListNode ans = new ListNode();
        ListNode res = ans;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                res.next = l1;
                res = res.next;
                l1 = l1.next;
            } else {
                res.next = l2;
                res = res.next;
                l2 = l2.next;
            }
        }

        //ListNode res = l1.val < l2.val ? l1 : l2;
        //res.next = mergeTwoLists(res.next, l1.val >= l2.val ? l1 : l2);
        //return res;
        if (l1 == null) {
            res.next = l2;
        }
        if (l2 == null) {
            res.next = l1;
        }
        return ans.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
