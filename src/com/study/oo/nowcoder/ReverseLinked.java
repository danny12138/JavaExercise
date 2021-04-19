package com.study.oo.nowcoder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ReverseLinked {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode ans = null;
        ListNode next = null;
        while (head != null){
            next = head.next;
            head.next = ans;
            ans = head;
            head = next;
        }
        return ans;
    }
    @Test
    public void test(){
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ln1.next = ln2;
        ln2.next = ln3;
        ReverseList(ln1);
    }

}
