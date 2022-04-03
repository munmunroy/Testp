package com.nagarro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList List =new LinkedList();
	List.insert( 60);
	List.insert( 80);
	List.insert( 51);
	List.insert( 56);
		//List.middleNode()
		List.show();
		System.out.println("Soreted list is:");
		List.sortedList();
		List.show();
		System.out.println("length of the List is:" +List.getCount());
		List.centerList();
	}

}
