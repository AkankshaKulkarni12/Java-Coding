package com.datasstructures;

// class representing the entire LinkedList
public class SinglyLinkedLists {

    private Node head;
    private Node tail;

    private int size;

    public SinglyLinkedLists(){
        this.size = 0;
    }

    // insert into the first position
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size += 1;
    }

    // insert into the last position
    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // insert at an index
    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if (index==0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index--, node.next);
        return node;
    }


    // delete the first element
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;

        return val;
    }

    // delete last element
    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    // delete based on index
    public int deleteInIndex(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }

        Node previous = get(index - 1);
        int val = previous.next.value;
        previous.next = previous.next.next;

        return val;
    }

    // get element using index
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    // find a Node
    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // display all the elements
    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // class representing Node of the LL
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }


    }




}
