package JavaPractice;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinarySearchTree {

	public Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void maxValue(int[] a, Node n) {
		int temp = 0, max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				temp = i;
			}
		}
		maxInsertion(a, temp);

	}

	public void levelOrderTraversal() {
		Node t2;
		Deque<Node> q = new LinkedList();
		t2 = root;
		if (root == null)
			return;
		q.add(t2);
		while (!q.isEmpty()) {
			t2 = q.pop();
			System.out.print(t2.data + " ");
			if (t2.getLeft() != null)
				q.add(t2.getLeft());

			if (t2.getRight() != null)
				q.add(t2.getRight());
		}
		System.out.println();
		System.out.println(t2.data);
	}

	public void InOrderIterative() {
		Node tl;
		if (root == null)
			return;
		Stack<Node> s = new Stack<Node>();
		tl = root;
		while (tl != null) {
			s.push(tl);
			tl = tl.getLeft();

		}
		while (!s.isEmpty()) {
			tl = s.pop();

			System.out.print(tl.data + " ");
			if (tl.getRight() != null) {
				tl = tl.getRight();
				while (tl != null) {
					s.push(tl);
					tl = tl.getLeft();
				}
			}
		}

	}

	public void maxInsertion(int[] a, int temp) {
		Node n1 = new Node(a[temp]);
		root = n1;
		Node p = null;
		Node t = root;
		for (int i = 0; i < a.length; i++) {
			Node n2 = new Node(a[i]);
			if (i < temp) {
				while (t.getLeft() != null) {

					p = t;
					t = t.getLeft();

				}
				p.setLeft(n2);
			} else {
				while (t.getRight() != null) {
					p = t;
					t = t.getRight();

				}
				p.setRight(n2);
			}

		}

	}

	public void insertion(int key) {
		Node n = new Node(key);
		// System.out.println("Inside insertion method");
		if (root == null) {
			// System.out.println("Root is being set!");
			root = n;
		} else {
			Node temp = root;
			Node prev = root;
			while (temp != null) {
				prev = temp;
				if (key < temp.data) {
					// System.out.print("inside left sub tree"+" ");
					temp = temp.getLeft();
				} else if (key >= temp.data) {
					temp = temp.getRight();
				}

			}
			if (key < prev.data) {
				prev.setLeft(n);
			} else if (key >= prev.data) {
				prev.setRight(n);
			}
		}

	}

	public void inOrderPrint() {
		inOrder(root);
	}

	public void inOrder(Node root) {
		if (root != null) {
			Node temp = root;
			inOrder(temp.getLeft());
			System.out.print(temp.data + " ");
			inOrder(temp.getRight());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Node root=null;
		Scanner sc = new Scanner(System.in);
		// int key = sc.nextInt();
		int a[] = { 4, 5, 12, 45, 32, 47, 8, 23, 21, 22 };
		BinarySearchTree b = new BinarySearchTree();
		// b.maxInsertion();
		b.insertion(5);
		b.insertion(3);
		b.insertion(4);
		b.insertion(2);
		b.insertion(7);
		b.insertion(6);
		b.insertion(8);
		b.insertion(9);
		b.insertion(0);
		//b.inOrderPrint();
		//b.InOrderIterative();
		b.levelOrderTraversal();
	}

}
