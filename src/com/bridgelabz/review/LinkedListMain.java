package com.bridgelabz.review;

public class LinkedListMain {

	public static void main(String args[]) {

		LinkedList<Integer> linkedList = new LinkedList<>();

		System.out.println("Append list is: ");
		linkedList.add(56);
		linkedList.add(30);
		linkedList.add(70);
		linkedList.print();

		int deletedData = linkedList.pop();
		System.out.println();
		System.out.println("popped head element is: " + deletedData);
		linkedList.print();
	}

}
