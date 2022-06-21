package com.bridgelabz.review;

public class LinkedList<E extends Comparable<E>> {

	Node<E> head;
	Node<E> tail;

	int size;

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	public void add(E data) {
		Node<E> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}

	}

	public E pop() {
		Node<E> temp = head;
		head = head.next;
		size--;
		return temp.data;

	}

}
