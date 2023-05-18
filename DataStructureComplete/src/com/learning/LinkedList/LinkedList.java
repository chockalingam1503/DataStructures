package com.learning.LinkedList;

public class LinkedList {

    Node node;

    public LinkedList(Node node) {
        this.node = node;
    }

    public void add(int value) {
        if (null == this.node) {
            this.node = new Node(value, null);
        } else {
            if (this.node.next == null) {
                node.next = new Node(value, null);
            } else {
                Node temp = node;

                while (temp.next != null) {

                    Node current = temp.next;
                    if (current.next == null) {
                        current.next = new Node(value, null);
                    }
                    temp = temp.next;
                }
            }
        }
    }

    public void print(){
        if (this.node != null) {


            do{
                System.out.println(node.getValue());
                this.node=node.next;
                if(this.node.next==null){
                    System.out.println(node.getValue());
                }
            }  while (this.node.next != null);



        }

    }
}
