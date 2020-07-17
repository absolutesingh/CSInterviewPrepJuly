class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class MyLL {
	static void print(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	static Node insertAtHead(Node head, int data)
	{
		Node temp = new Node(data); // Create new Node
		temp.next = head;
		head = temp;
		return head;
	}
	static Node insertAtEnd(Node head, int data)
	{
		if(head == null)
		{
//			Node temp = new Node(data);
//			head = temp;
//			return head;
//			Node temp = new Node(data);
//			return temp; //Head will change hence return type Node
			return new Node(data);
		}
		Node temp = new Node(data);
		Node last = head;
		while(last.next!=null)
		{
			last = last.next;
		}
		//Last node found
		last.next = temp;
		return head; //  No change but return required because of return type.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = insertAtEnd(head,1);
		head = insertAtEnd(head,2);
		head = insertAtEnd(head,3);
		//Traversing the LL
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		print(head);
		head = insertAtHead(head,4);// Update head to the new head;
		print(head);
		head = insertAtEnd(head,5);
		print(head);
	}

}
