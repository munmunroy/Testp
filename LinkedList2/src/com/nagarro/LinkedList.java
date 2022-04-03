package com.nagarro;

public class LinkedList {
	Node head;
	public void insert(int data)
	{
		Node newNode =new Node();
		newNode.data=data;
		newNode.next=null;
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node node=head;
			while(node.next!=null)
			{
				node=node.next;
			}
			node.next=newNode;
		}
	}
	public void insertAt(int index,int data)
	{
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=null;
		 Node node = head;
		 for(int i=0; i<index-1;i++)
		 {
			 node=node.next;
		 }
		 newNode.next=node.next;
		 node.next=newNode;
	}
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node node=head;
			Node delNode=null;
			for(int i=0; i<index-1;i++)
			 {
				 node=node.next;
			 }
			delNode=node.next;
			node.next=delNode.next;
			System.out.println("Deleted node is:" +delNode.data);
		}
	}
public void sortedList()
{
	 
    // Node current will point to head
    Node current = head, index = null;

    int temp;

    if (head == null) {
        return;
    }
    else {
        while (current != null) {
            // Node index will point to node next to
            // current
            index = current.next;

            while (index != null) {
                // If current node's data is greater
                // than index's node data, swap the data
                // between them
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }

                index = index.next;
            }
            current = current.next;
        }
    }
}
/**public void reverse()
{
	for(int = )
}**/
public void centerList()
{
	Node slow=head;
	Node fast=head;
	while(fast!=null && fast.next!=null)
	{
		fast=fast.next.next;
		slow=slow.next;
	}
	System.out.println("Middle element of the List is :"+slow.data);
}
public int getCount()
{
	Node temp=head;
	int count=0;
	while(temp!=null)
	{
		count++;
		temp=temp.next;
	}
	return count;
}
	public void show()
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
}
