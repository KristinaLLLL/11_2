package com.company;

import java.util.NoSuchElementException;

public class LinkedQueue<E> {

    private DoublyLinkedNode<E> head;
    private DoublyLinkedNode<E> tail;

    int size;

    public void enqueue(E item) {

        DoublyLinkedNode<E> oldTail = this.tail;

        DoublyLinkedNode<E> newTailnode = new DoublyLinkedNode<E>(item);

        if (oldTail != null) {
            oldTail.setNextNode(newTailnode);
            newTailnode.setNextNode(null);
            this.tail = newTailnode;

        } else {
            this.tail = newTailnode;
            this.head = newTailnode;
        }
        size++;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int length() {
        return size;
    }

    public E deque() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }

        E data = this.head.getData();

        this.head = this.head.getNextNode();

        size--;

        return data;
    }

    public E peek() {
        return this.head.getData();
    }
}