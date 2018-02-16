package JavaPractice;

import java.util.Stack;

public class TowersOfHenoi {
	public static void hanoiMethod(int n,Stack<String>src,Stack<String>des,Stack<String>temp) {
		if(n>0) {
	hanoiMethod(n-1,src,temp,des);
	movePlate(src,des);
	hanoiMethod(n-1,temp,des,src);
		}
	}
	public static void movePlate(Stack<String>src,Stack<String>des){
		des.push(src.pop());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s1 = new Stack<>();
		Stack<String> s2 = new Stack<>();
		Stack<String> s3 = new Stack<>();
		s1.push("ayman");
		s1.push("haroon");
		s1.push("aaquib");
		s1.push("wasay");
		s1.push("omer");
		hanoiMethod(5,s1,s2,s3);
		while(!s2.isEmpty()) {
			System.out.println(s2.pop());
		}
		/*for(String w:s2) {
			System.out.println(s2.peek());
			System.out.println(s2.pop());
			//System.out.println(w);
		}*/

	}

}
