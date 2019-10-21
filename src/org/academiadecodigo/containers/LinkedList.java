package org.academiadecodigo.containers;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

    private Node<E> head;
    private int size;

    public LinkedList() {

        this.head = null;
    }

    public void add(E data) {

        Node<E> node = new Node(data);

        if (head == null) {
            head = node;
        }
    }

    public E get(int index) {

        Node<E> iterator = head;
        int i = 0;

        if (iterator == null) {
            return null;
        }

        if (index < 0 || index > size) {

            return null;
        }

        while(iterator.next != null) {
            if (i == index) {
                return iterator.data;
            }
            iterator = iterator.next;
            i++;
        }

        return null;
    }

    public void remove(E data) {

        Node<E> iterator = head;


    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private class Node<E> {

        private E data;
        private Node next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
