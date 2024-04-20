package com.leetcode;

/*
*   202. Happy Number - (Google Question)
*   Problem Statement - Write an algorithm to determine if a number n is happy.
*   A happy number is a number defined by the following process:
*   Starting with any positive integer, replace the number by the sum of the squares of its digits. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
*   Those numbers for which this process ends in 1 are happy.
*   Return true if n is a happy number, and false if not.
*
*
*   Use the Linked List Cycle concept
*
* */

public class HappyNumber {

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

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);

        if (slow==1){
            return true;
        }
        return false;


    }

    private int findSquare(int num){
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            ans += rem * rem;
            num = num/10;
        }
        return ans;
    }
}
