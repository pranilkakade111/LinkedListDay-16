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
		
		public void addNode(int data)
		{
			Node newnode=new Node(data);
			
			if(head==null)
			{
				head=newnode;
				tail=newnode;
			}
			else
			{
				tail.next=newnode;
				tail=newnode;
			}
		}
		
		public void display() 
		{
		  Node current = head;
		   
		   if(head==null)
		   {
			   System.out.println("List is Empty");
			   return;
		   }
		   
		   System.out.print("the Link List is=");
		   while(current!=null)
		   {
		   System.out.print(current.data+ " ");
		   current=current.next;
		}      
	}

	public static  void main(String[] args) 
	{
		DemoLinkList sList = new DemoLinkList();    
        sList.addNode(56);  
        sList.addNode(30);  
        sList.addNode(70); 
        
        sList.display();

      
	}
}
