package com.bridgelabz.datastructures;

public class DataStructures {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList=new LinkedList<>();

        // For UC2
        //linkedList.push(70);
        //linkedList.push(30);
        //linkedList.push(56);

        // For UC3
        //linkedList.add(56);
        //linkedList.add(30);
        //linkedList.add(70);

        // For UC4
        linkedList.add(56);
        linkedList.add(70);
        linkedList.insertBetween(30);

        linkedList.print();
    }
}
