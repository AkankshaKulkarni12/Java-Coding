package com.leetcode;

/*
*   142. Linked List Cycle 2
*   Problem Statement - Given the head of a linked list, return the node where the cycle begins.If there is no cycle, return null.
*
*
*   Steps -
*   1. Find the length of the cycle.
*   2. Move s ahead by length of cycle times.
*   3. Move s and f one by one, it will meet at start.
*
* */

public class LinkedListCycle2 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public boolean hasCycle(LinkedListCycle.ListNode head) {
        LinkedListCycle.ListNode fast = head;
        LinkedListCycle.ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

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

    public ListNode detectCycle(ListNode head){
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = cycleLength(slow);
                break;
            }
        }

        if (length == 0){
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while(length > 0){
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s){
            f = f.next;
            s = s.next;
        }

        return s;
    }
}
