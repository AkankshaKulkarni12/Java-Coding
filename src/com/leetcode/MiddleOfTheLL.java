package com.leetcode;

/*
*   876. Middle of the Linked List
*   Problem Statement - Given the head of a singly linked list, return the middle node of the linked list.
*
*   Use fast and slow pointer method.
*   Slow ptr - one step
*   Fast ptr - twice of slow.
*
* */

public class MiddleOfTheLL {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
