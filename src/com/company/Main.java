package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MyCollection<Integer> collection = new MyCollection<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(1);
        collection.add(45);
        for (Integer i : collection) {
            System.out.println(i);
        }
        Iterator<Integer> it = collection.iterator();
        while(it.hasNext()) {
            it.remove();
            if (it.next() == 45) {
                it.remove();
            }
        }
        for (Integer i : collection) {
            System.out.println(i);
        }

    }
}
