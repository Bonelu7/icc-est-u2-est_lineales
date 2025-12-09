package controllers;

import java.util.EmptyStackException;
import models.Node;

public class Stack<T> {

    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T data = top.getValue();
        top = top.getNext();
        size--;
        return data;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void printlnNodes() {
        Node<T> current = top;

        if (current == null) {
            System.out.println("Stack vacío.");
            return;
        }

        System.out.println("Contenido del Stack:");
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
