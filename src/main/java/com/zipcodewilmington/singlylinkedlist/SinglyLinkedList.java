package com.zipcodewilmington.singlylinkedlist;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    public class Node {

        private Node nextNode;
        private int data;

        private Node() {

        }

        Node(int val) {
            data = val;
        }

        Node(int val, Node next) {
            data = val;
            nextNode = next;
        }

        private void setData(int val) {
            this.data = val;
        }

        int getData() {
            return this.data;
        }

        void setNextNode(Node n) {
            this.nextNode = n;
        }

        Node getNextNode() {
            return this.nextNode;
        }
    }

    public Node root;
    public int size;

    public SinglyLinkedList() {
        Node root = new Node(0);
        size = 0;
    }

    public void setSize(int a) {
        this.size = a;
    }

    public int getSize() {
        return this.size;
    }

    public Node add(int data) {
        Node newNode = new Node(data, root);
        this.root = newNode;
        this.size++;
        return newNode;
    }

    public Node find(int data) {
        Node thisNode = this.root;

        while (thisNode != null) {
            if (thisNode.getData() == data)
                return thisNode;
            thisNode = thisNode.getNextNode();
        }
        return null;
    }

    public boolean remove(int data) {
        Node thisNode = this.root;
        Node prevNode = null;


        while (thisNode != null) {
            if (thisNode.getData() == data) {
                prevNode.setNextNode(thisNode.getNextNode());

                this.setSize(this.getSize() - 1);
                return true;
            }
            prevNode = thisNode;
            thisNode = thisNode.getNextNode();

        }
        return false;
    }

    public boolean contains(int data) {
        return true;
    }

    public void getElementAtSpecifiedIndex() {

    }

    public void copy() {

    }

    public void sort() {

    }
}











