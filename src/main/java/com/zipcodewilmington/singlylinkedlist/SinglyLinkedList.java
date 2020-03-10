package com.zipcodewilmington.singlylinkedlist;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    //private T element;
    //private Node next;


    private class Node {
        private T element;
        private Node next;

        //constructor
        public Node(T element) {
            this.element = element;
        }

        // Constructor
        public Node(Node next, T element) {
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }


    }
}











