package com.leetcode;

/*
*   21. Merge Two Sorted Lists
*
*   Problem Statement - You are given the heads of two sorted linked lists list1 and list2. Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
*
* */

public class MergeTwoSortedLists {

    /**
     * Definition for singly-linked list.
     * public class ListNode1 {
     *     int val;
     *     ListNode1 next;
     *     ListNode1() {}
     *     ListNode1(int val) { this.val = val; }
     *     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
     * }
     */

    public class ListNode1{
        int val;
        ListNode1 next;

        ListNode1(){

        }
        
        ListNode1(int val){
            this.val = val;
        }
        ListNode1(int val, ListNode1 next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        ListNode1 ansList = new ListNode1();
        ListNode1 node = ansList;

        // if list1 has no elements, return list2
        if(list1 == null){
            return list2;
        }
        // if list2 has no elements, return list1
        if(list2 == null){
            return list1;
        }
        // traverse both the lists and add the elements to the list in ascending order until one of the lists is null
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
            }
            else{
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        if(list1 != null){
            node.next = list1;
        }
        if(list2 != null){
            node.next = list2;
        }

        return ansList.next;
    }
}
