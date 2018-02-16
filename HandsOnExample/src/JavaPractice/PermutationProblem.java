package JavaPractice;

public class PermutationProblem {
	public static void listPermutation(String SoFar,String rest) {
		if(rest.length()==0)
			System.out.println(SoFar);
		
		for(int i=0;i<rest.length();i++) {
			String next= SoFar+rest.charAt(i);
			String remaining = rest.substring(0,i)+rest.substring(i+1);
			listPermutation(next,remaining);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source= "abcde";
		String destination="";
		listPermutation(destination,source);
		System.out.println(destination);
 
	}

}
