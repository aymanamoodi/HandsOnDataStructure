package JavaPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String [] args) {
		Pattern p = Pattern.compile("[0-9]{3}[$]");
		Matcher m = p.matcher("111$");
		if(m.find()) {
			System.out.println("you have successfully cleared");
			System.out.println(m.group());
		}
		else {
			System.out.println("no mathcer found");
		}
	}

}
