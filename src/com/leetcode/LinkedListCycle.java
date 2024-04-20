package com.leetcode;

/*
*   141. Linked List Cycle
*
*   Problem Statement - Given head, the head of a linked list, determine if the linked list has a cycle in it.
*
* */

public class LinkedListCycle {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    public int cycleLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // calculate length
                ListNode temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                }while (temp != slow);
                return length;
            }
        }
        return 0;
    }
}

