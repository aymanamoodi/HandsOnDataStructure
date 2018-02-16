package JavaPractice;

import java.util.Scanner;

public class BinarySearchRecursion {
	public Node insertion(Node root,int data) {
		Node temp=root;
		Node n= new Node(data);
		if(root==null) {
			
			root=n;
			return root;
		}
		
		else {
			
			if(data<temp.data) {
				
				temp.setLeft(insertion(temp.getLeft(),data));
			}
			else if(data>=temp.data) {
				temp.setRight(insertion(temp.getRight(),data));
			}
		}
		return n;
	}
	
	public void inOrder(Node root) {
		if(root==null) {
			System.out.println("tree is empty");
		}
		else {
			Node temp=root;
			inOrder(temp.getLeft());
			System.out.println(temp.data);
			inOrder(temp.getRight());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node root=null;
			Scanner sc = new Scanner(System.in);
			int key=sc.nextInt();
			BinarySearchRecursion b1 = new BinarySearchRecursion();
			b1.insertion(root,key);
			b1.inOrder(root);
			
			

	}

}
