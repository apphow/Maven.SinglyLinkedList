package com.zipcodewilmington.singlylinkedlist;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    public Node root; //every linked list has a pointer to its root node,
    public int size; // every linked list stores the size of the linked list as an integer

    public SinglyLinkedList() {
        Node root = new Node(0); //simple constructor initializes the root node and the size to 0;
        size = 0;
    }

    public void setSize(int a) {
        this.size = a;
    }

    public int getSize() {
        return this.size;
    }

    public Node add(int data) {
        Node newNode = new Node(data, root);//add a new node using the piece of data, and then the root node as the next pointer
        this.root = newNode; //then we set the root to the new node
        this.size++; //we increment the size of the list
        return newNode;//then return the new node
    }

    public Node find(int data) {
        Node thisNode = this.root; //first create a node called this node for the root
//as we iterate through the list we can use thisNode to iterate the list.
        while (thisNode != null) {   // While this list is not null (while not at end of the list)
            if (thisNode.getData() == data)//if thisNode's data is the data we're looking for then,
                return thisNode; //return this node; returns the node itself, not the value in the node, otherwise
            thisNode = thisNode.getNextNode();//if value not in previous node, advance pointer to the next node
        }
        return null;//if at end of list we didn't find our value, we return null
    }

    public boolean remove(int data) { //looking for this piece of data. if found, we'll remove it
        Node thisNode = this.root; //to find the node we're looking for
        Node prevNode = null; //for a find operation, we always need the pointer to the previous node, as well. Starts
        //at null because there's no previous node to the root

        while (thisNode != null) {
            if (thisNode.getData() == data) { //if this data is the data we're looking for
                prevNode.setNextNode(thisNode.getNextNode());//then we'll set previous node,next node pointer, to this nodes next node pointer.
                //in other words, we'll delete the prevNode from the list
                this.setSize(this.getSize() - 1);
                return true;
            }
            prevNode = thisNode;//if thisNode is not the node we're looking for, advance the previous Node pointer to thisNode
            thisNode = thisNode.getNextNode();//and we advance thisNode pointer to the next node
            //advance both pointers by 1 after we go through the list each time data isn't found
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






