package com.datasstructures;

public class DoublyLinkedList {

    Node head;

    // insert at first position
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    // display the elements
    public void display(){
        Node node = head;
        Node last = null;

        // print from first to last
        while (node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        // print in reverse order
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("END");
    }

    // insert in the last position
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

        // traverse the LL until you point to the last node
        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    // insert after a particular value
    public void insert(int after, int val){
        Node p = find(after);

        if (p == null){
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if (node.next != null){
            node.next.prev = node;
        }

    }

    // find a node with a value
    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
    }
}
