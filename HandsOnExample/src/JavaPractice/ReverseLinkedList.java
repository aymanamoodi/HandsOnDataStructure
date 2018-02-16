package JavaPractice;

public class ReverseLinkedList {
	void reversalList(LNode head) {
		LNode current=head;
		LNode previous= null;
		LNode nextPointer;
		while(current!=null) {
			nextPointer=current.pointer;
			current.pointer=previous;
			previous=current;
			current=nextPointer;
			
			
		}
		head=previous;
		LinkedListInsertionSort.display(head);
	}
	
	
	public static void main(String[] args) {
		LNode l1= new LNode(4);
		LNode l2= new LNode(2);
		LNode l3= new LNode(6);
		LNode l4= new LNode(8);
		LNode l5= new LNode(1);
		LNode l6= new LNode(3);
		LNode l7= new LNode(7);
		LNode l8= new LNode(5);
		l1.pointer=l2;
		l2.pointer=l3;
		l3.pointer=l4;
		l4.pointer=l5;
		l5.pointer=l6;
		l6.pointer=l7;
		l7.pointer=l8;
		LNode head =l1;
		LinkedListInsertionSort.display(head);
		ReverseLinkedList rll = new ReverseLinkedList();
		rll.reversalList(head);
		
		
	}

}
 