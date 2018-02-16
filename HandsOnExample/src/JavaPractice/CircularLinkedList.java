package JavaPractice;

public class CircularLinkedList {
	boolean Circular(LNode head) {
		LNode slow = head;
		LNode faster = head;
		if (head == null) {
			return false;
		}
		while (faster.pointer != null || faster.pointer.pointer != null) {
			slow=slow.pointer;
			faster=faster.pointer.pointer;
			if(faster==slow && faster.pointer!=null) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LNode ln = new LNode(4);
		LNode ln1 = new LNode(7);
		LNode ln2 = new LNode(6);
		LNode ln3 = new LNode(1);
		LNode ln4 = new LNode(2);
		LNode ln5 = new LNode(3);
		LNode ln6 = new LNode(5);
		LNode ln7 = new LNode(8);
		LNode ln8 = new LNode(9);
		LNode ln9 = new LNode(10);
		ln.pointer = ln1;
		ln1.pointer = ln2;
		ln2.pointer = ln3;
		ln3.pointer = ln4;
		ln4.pointer = ln5;
		ln5.pointer = ln6;
		ln6.pointer = ln7;
		ln7.pointer = ln8;
		ln8.pointer = ln9;
		ln9.pointer = ln6;
		CircularLinkedList cl = new CircularLinkedList();
	if(cl.Circular(ln)) {
		System.out.println("There is a loop in the list");
	}else
		
		
		System.out.println("the ris no loop");

	}

}
