package com.zipcodewilmington.singlylinkedlist;
//set up a Node class as a private inner Node class
public class Node {
    //every Node has a nextMode and a data value;
    private Node nextNode;
    private int data;
    // create 3 simple constructors.
    //1st a no argument constructor so we can just create a Node
    private Node() {

    }
    //2nd a one argument constructor where we can pass in a value but have a null next Node.

    Node(int val) {
        data = val;
    }
    //3rd a two argument constructor where we can pass in the value and have a next Node.

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
