package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.SimpleTimeZone;

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
}
