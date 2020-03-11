package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void getSize() {
        SinglyLinkedList sing = new SinglyLinkedList();
        System.out.println(sing.getSize());
        sing.add(14);
        sing.add(35);
        sing.add(41);
        System.out.println(sing.getSize());
        Assert.assertEquals(3, sing.getSize());
    }

    @Test
    public void add() {
        SinglyLinkedList sing = new SinglyLinkedList();
        sing.add(14);
        sing.add(35);
        sing.add(41);
        sing.add(14);
        sing.add(35);
        sing.add(41);
        int expected = 6;
        int actual = sing.getSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void find() {
        SinglyLinkedList sing = new SinglyLinkedList();
        sing.add(14);
        sing.add(35);
        sing.add(41);
        sing.add(18);
        int expected = 18;
        int actual = sing.find(18).getData();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        SinglyLinkedList sing = new SinglyLinkedList();
        System.out.println(sing.getSize());
        sing.add(4);
        System.out.println(sing.getSize());
        sing.add(23);
        sing.add(18);
        System.out.println(sing.getSize());
        System.out.println(sing.find(23).getData());
        sing.remove(23);
        System.out.println(sing.find(23));
        System.out.println(sing.getSize());
    }

    @Test
    public void addElement() {
    }
}
