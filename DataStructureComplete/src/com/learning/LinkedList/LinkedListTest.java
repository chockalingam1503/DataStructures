package com.learning.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        Node node = new Node(1, null);
        LinkedList lst = new LinkedList(node);

        lst.add(2);
        lst.add(3);
        lst.print();
    }
}
