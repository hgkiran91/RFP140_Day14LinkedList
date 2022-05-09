package com.bridgelabz.datastructures;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;


    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertBetween(T insertData) {
        Node<T> newNode = new Node<>(insertData);
        head.next = newNode;
        newNode.next = tail;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public T pop() {
        Node<T> popElement = head;
        T element = popElement.data;
        Node<T> nextEle = popElement.next;
        popElement.data = null;
        popElement.next = null;
        head = nextEle;
        return element;
    }
}
