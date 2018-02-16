package JavaPractice;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node root;

	public int maxValue(int[] a) {
		int temp = 0, max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				temp = i;
			}
		}
		return temp;
	}

	public void inOrder() {
		inOrderPrint(root);
	}

	public void inOrderPrint(Node root) {
		if (root != null) {
			Node temp = root;
			inOrderPrint(temp.getLeft());
			System.out.print(temp.data + " ");
			inOrderPrint(temp.getRight());
		}

	}

	/*
	 * void insertion(int[] a, int temp) { Node t=null; for(int i=0;i<a.length;i++)
	 * { if(root== null) { Node n = new Node(a[temp]); root= n; }
	 * 
	 * else if(a[i]!=a[temp]) { t=root; Node n = new Node(a[i]);
	 * if(t.getLeft()==null) { t.setLeft(n); } else if(t.getRight()==null) {
	 * t.setRight(n); } } }
	 * 
	 * }
	 */
	private void insert(int t) {
		Node n = new Node(t);
		if (root == null) {
			System.out.println("Inside root");
			root = n;
		} else {
			Node temp = root;
			Queue<Node> q = new LinkedList<Node>();
			q.add(temp);
			while (!q.isEmpty()) {
				temp = q.peek();
				q.remove();
				
				if (temp.getLeft() == null) {
					temp.setLeft(n);
					break;
				} else
					
					q.add(temp.getLeft());
				if (temp.getRight() == null) {
					temp.setRight(n);
					break;
				} else
					q.add(temp.getRight());

			}
		}

	}

	public static void main(String args[]) {
		int a[] = { 4, 5, 12, 45, 32, 47, 8, 23, 21, 22 };
		BinaryTree b = new BinaryTree();
		BinaryTree b1 = new BinaryTree();
		BinaryTree b2 = new BinaryTree();
		
		int temp = b.maxValue(a);
		// b.insertion(a,temp);
		b.insert(a[temp]);
		
		for (int i = 0; i < temp; i++) {
			
				b1.insert(a[i]);
		} 
		for(int i=temp+1;i<a.length;i++) {
			b2.insert(a[i]);
		}
		b.root.setLeft(b1.root);
		b.root.setRight(b2.root);
		b1.inOrder();
		System.out.println();
		b2.inOrder();
		System.out.println();
		b.inOrder();

		}

	}
