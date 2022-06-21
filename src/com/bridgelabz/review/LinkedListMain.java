package com.bridgelabz.review;

public class LinkedListMain {

	public static void main(String args[]) {

		LinkedList<Integer> LinkedList = new LinkedList<>();

		System.out.println("Append list is: ");
		LinkedList.add(56);
		LinkedList.add(30);
		LinkedList.add(70);
		LinkedList.print();

		int deletedData = LinkedList.pop();
		System.out.println();
		System.out.println("popped head element is: " + deletedData);
		LinkedList.print();
	}

}
