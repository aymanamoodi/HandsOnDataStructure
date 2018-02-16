package JavaPractice;

import java.util.HashSet;
import java.util.Set;

 class LinkedList1 {
	LNode head;
	LNode temp;

	public void insert(int data) {
		LNode n = new LNode(data);
		if (head == null) {
			head = n;
		} else {
			temp = head;
			while (temp.pointer != null) {
				temp = temp.pointer;
			}
			temp.pointer = n;
		}

	}
	public void delete(int data) {
		temp=head;
		LNode previous=null;
		while(temp.data!=data) {
			previous=temp;
			temp=temp.pointer;
		}
		previous.pointer=temp.pointer;
	}

	public void display() {
		temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.pointer;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		LinkedList1 l= new LinkedList1();
		for(int i=0;i<10;i++)
		s.add(2*i);
		for(int a:s) {
			l.insert(a);
		}
		l.display();
		l.delete(2);
		l.display();
	}

}
