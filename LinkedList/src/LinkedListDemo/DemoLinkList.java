package LinkedListDemo;

public class DemoLinkList
{
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
		public	Node head=null;
		public	Node tail=null;
		
		public void addNodeAtTheBeginning(int data)
		{
	        System.out.println("Add a node with data " + data + " in the beginning.");
			Node newNode = new Node(data);

			if (this.head == null) {
				this.head = newNode;
			} else {
				newNode.next = this.head;

				this.head = newNode;
			}
		}
	  
	 
		public void addNodeAtTheEnd(int data) 
		{
	        System.out.println("Add a node with data " + data + " at the end.");
			Node newNode = new Node(data);

			if (this.head == null) {
				this.head = newNode;
			} else {
				Node cur = this.head;
				while (cur.next != null) {
					cur = cur.next;
				}
				cur.next = newNode;
			}
		}
	  
	  
				public void add(int position, int data) 
		{
	        System.out.println("Add a node with data " + data + " at the position " + position);
			Node newNode = new Node(data);

			Node cur = this.head, prev = this.head;

			if (position == 1) {
				newNode.next = head;
				this.head = newNode;
				return;
			}

			while (cur.next != null && --position > 0) {
				prev = cur;
				cur = cur.next;
			}

			prev.next = newNode;

			newNode.next = cur;
		}

				public void deleteFirstOccurenceOfData(int data) 
				{
			        System.out.println("Deleting First Occurance of data " + data + " from the list");
					if (this.head == null) {
						System.out.println("The List is empty.\n");
						return;
					}

					Node cur = this.head, prev = this.head;

					if (this.head.data == data) {
						this.head = this.head.next;
						return;
					}

					while (cur != null && cur.data != data) {

						prev = cur;
						cur = cur.next;
					}

					if (cur != null) 
					{
						prev.next = cur.next;
					} else 
					{
						System.out.println("The data " + data + " could not be found in the List");
					}
				}		
	  	
		public void display() 
		{
			if (this.head == null) {
				System.out.println("The List is empty.");
			} else {
				System.out.println("The contents of the Singly Linked List are : ");
				Node cur = this.head;
				while (cur != null) {
					System.out.print(cur.data + " -> ");
					cur = cur.next;
				}
				System.out.println("NULL\n");
			}    
		}

				
	public static  void main(String[] args) 
	{
		DemoLinkList sList = new DemoLinkList(); 
		
			sList.addNodeAtTheBeginning(56);
		    sList.display();
			sList.addNodeAtTheBeginning(30);
			sList.display();
	      	sList.addNodeAtTheEnd(70);
		    sList.display();

	        sList.add(1,150);
	        sList.display();
	        sList.add(3,250);
	        sList.display();
	        sList.add(4,250);
	        sList.display();
	        
	        sList.deleteFirstOccurenceOfData(30);
			sList.display();
			sList.deleteFirstOccurenceOfData(250);
			sList.display();
			sList.deleteFirstOccurenceOfData(150);
			sList.display();
        
        

      
	}
}
