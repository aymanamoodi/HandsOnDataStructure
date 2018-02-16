package JavaPractice;

//This java file will sort a linked list in ascending order using selection sort
public class LinkedListInsertionSort {
	static LNode head;

	void Sorting(LNode head) {
		System.out.println("Inside Sorting method");
		LNode temp;
		LNode prev = head;
		int data = 0;
		while (prev != null) {
			data = prev.data;
			temp = prev.pointer;
			// System.out.println("the initial value prev is "+prev.data+"the initial value
			// of temp is "+temp.data);
			while (temp != null) {
				if (temp.data < data) {
					data = temp.data;
					System.out.println("the value of data is " + data);
				}
				temp = temp.pointer;
			}
			if (prev.data > data) {
				temp = prev;
				while (temp.data != data) {
					temp = temp.pointer;
				}
				System.out.println("the previous value is " + prev.data + "the temp value is " + temp.data);
				int value = prev.data;
				prev.data = temp.data;
				temp.data = value;
				System.out.println("after previous value is " + prev.data + "the temp value is " + temp.data);
			}
			prev = prev.pointer;
		}

	}

	void removeDuplicate(LNode head) {
		LNode temp = head;
		LNode next = null;
		while (temp != null) {
			next=temp;
			while(next.pointer!=null) {
				if(next.pointer.data==temp.data) {
					next.pointer=next.pointer.pointer;
				}
				else {
					next=next.pointer;
				}
				
			}
			temp=temp.pointer;
			
		}
	}

	public static void display(LNode head) {
		LNode temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.pointer;
		}
		System.out.println();
	}
	int kthElement(LNode head, int position) {
		LNode temp=head;
		int length=0;
		LNode prev = head;
		while(temp!=null) {
			temp=temp.pointer;
			length++;
		}
		temp=head;
		for(int i=0;i<length-position;i++) {
			temp=temp.pointer;
			
		}
		
		return temp.data;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LNode l1 = new LNode(4);
		LNode l2 = new LNode(2);
		LNode l3 = new LNode(6);
		LNode l4 = new LNode(2);
		LNode l5 = new LNode(4);
		LNode l6 = new LNode(3);
		LNode l7 = new LNode(6);
		LNode l8 = new LNode(5);
		l1.pointer = l2;
		l2.pointer = l3;
		l3.pointer = l4;
		l4.pointer = l5;
		l5.pointer = l6;
		l6.pointer = l7;
		l7.pointer = l8;
		head = l1;
		LinkedListInsertionSort lli = new LinkedListInsertionSort();
		//lli.Sorting(head);
		lli.display(head);
		//lli.removeDuplicate(head);
		System.out.println(lli.kthElement(head, 2));
		lli.display(head);
	}
}
