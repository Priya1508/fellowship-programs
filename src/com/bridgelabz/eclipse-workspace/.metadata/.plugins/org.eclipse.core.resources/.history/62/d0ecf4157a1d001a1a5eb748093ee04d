package Linked_List;

public class SinglyLinkedList {
	
	public void display(ListNode head) {
		if(head==null) {
			return ;
		}
		
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println(current);
	}
	//private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public int length(ListNode head) {
		if(head==null) {
			return 0;
		}
		//create a count to hold length
		int count=0;
		ListNode current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public ListNode insertAtBeginning(ListNode head,int data) {
		ListNode newNode=new ListNode(data);
		if(head==null) {
			return newNode;
		}
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	public ListNode insertAtEnd(ListNode head,int data) {
		ListNode newNode=new ListNode(data);
		if(head==null) {
			return newNode;
		}
		ListNode current=head;
		while(null!=current.next) {
			current=current.next;
		}
		current.next=newNode;
		return head;
	}
	
	public void insertAfter(ListNode previous,int data) {
		if(previous==null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		ListNode newNode=new ListNode(data);
		newNode.next=previous.next;
		previous.next=newNode;
	}

	public static void main(String[] args) {
		ListNode head=new ListNode(10);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(1);
		ListNode fourth=new ListNode(11);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		// fourth.next=head;
		
		SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
		singlyLinkedList.display(head);
		System.out.println();
		System.out.print("Length of the node is-->"+singlyLinkedList.length(head));
		System.out.println();
		System.out.println("After inserting new node at beginning of the linked list");
		ListNode newNode=singlyLinkedList.insertAtBeginning(head, 15);
		singlyLinkedList.display(newNode);
		System.out.println();
		System.out.println("After inserting new node at end of the linked list");
		ListNode newHead=singlyLinkedList.insertAtEnd(head, 15);
		singlyLinkedList.display(newHead);
		System.out.println();
		System.out.println("After inserting new node after the given position");
		singlyLinkedList.insertAfter(third, 20);
		singlyLinkedList.display(head);

	}

}
