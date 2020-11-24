package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedQueue<Double> queuelist = new LinkedQueue<Double>();
        queuelist.enqueue(60.0);
        queuelist.enqueue(12.0);
        queuelist.enqueue(16.4);
        queuelist.enqueue(26.5);

        queuelist.deque();
        System.out.println("queuelist.peek:"+ queuelist.peek());

        queuelist.deque();
        System.out.println("queuelist.length:"+queuelist.length());
        System.out.println("queuelist.peek:"+ queuelist.peek());
    }
    
}
