package com.company;

public class DoublyLinkedNode<E> {
    private E data;
    private DoublyLinkedNode<E> nextNode;
    private DoublyLinkedNode<E> previousNode;

    public DoublyLinkedNode(E data) {
        this.data = data;
    }
    public E getData() {
        return data;
    }
    public DoublyLinkedNode<E> getNextNode() {
        return nextNode;
    }
    public void setNextNode(DoublyLinkedNode<E> nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyLinkedNode<E> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyLinkedNode<E> prevNode) {
        this.previousNode = prevNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

}
