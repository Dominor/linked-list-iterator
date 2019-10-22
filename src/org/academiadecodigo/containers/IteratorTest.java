package org.academiadecodigo.containers;

import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {

        //LinkedListSolution<Integer> list = new LinkedListSolution<>();
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(30);
        list.add(15);

        System.out.println(list.size());

        for (Integer i : list) {
            System.out.println(i);
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
