package JavaPractice;

public class StringPalindrome {
	
	public void reverse(String s) {
		String rev="";
		char[] d=s.toCharArray();
		for(int i= s.length()-1;i>=0;i--) {
			rev=rev+d[i];
		}
		System.out.println(rev);
	}
	
public static void main(String[] args) {
	String s="nitin";
	StringPalindrome sp = new StringPalindrome();
	sp.reverse("ayman");
}
}
