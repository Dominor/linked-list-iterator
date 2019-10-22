package org.academiadecodigo.containers;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

    private Node head;
    private int size = 0;

    public LinkedList() {

        this.head = new Node();
    }

    public void add(E data) {

        Node node = new Node(data);
        Node iterator = head;

        while(iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = new Node(data);
        size++;
    }

    public E get(int index) {

        Node iterator = head;
        int i = 0;

        if (index < 0 || index > size) {

            return null;
        }

        while(iterator.next != null) {
            if (i == index) {
                return iterator.next.data;
            }
            iterator = iterator.next;
            i++;
        }

        return null;
    }

    public E get (E data) {

        Node iterator = head;

        if (data == null) {

            return null;
        }

        while(iterator.next != null) {
            if (iterator.next.data.equals(data)) {
                return iterator.next.data;
            }
            iterator = iterator.next;
        }

        return null;
    }

    public void remove(E data) {

        Node iterator = head;

        if (data == null) {
            return;
        }

        while (iterator.next != null) {

            if (iterator.next.data.equals(data)) {
                iterator.next = iterator.next.next;
                size--;
                return;
            }
            iterator = iterator.next;
        }
    }

    public int indexOf(E data) {

        Node iterator = head;
        int i = 0;

        if (data == null) {

            return -1;
        }

        while(iterator.next != null) {
            if (iterator.next.data.equals(data)) {
                return i;
            }
            iterator = iterator.next;
            i++;
        }

        return -1;
    }

    public int size() {

        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            Node iterator = head;

            @Override
            public boolean hasNext() {
                return iterator.next != null;
            }

            @Override
            public E next() {

                if (!hasNext()) {
                    return null;
                }
                iterator = iterator.next;
                return iterator.data;
            }

            @Override
            public void remove() {
                LinkedList.this.remove(iterator.next.data);
            }
        };
    }

    private class Node {

        private E data;
        private Node next;

        Node() {
            this.data = null;
            this.next = null;
        }

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
