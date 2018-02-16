package JavaPractice;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class HeckerRankRegex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s =sc.nextLine();
            if(Pattern.compile("^hackerrank[a-z\\s]*hackerrank$").matcher(s).find()){
                System.out.println(2);
            }
            else if (Pattern.compile("^hackerrank[a-z\\s]*").matcher(s).find()){
                System.out.println(1);
            }
            else if(Pattern.compile("[a-z\\s]*hackerrank$").matcher(s).find())
                System.out.println(0);
            else
                System.out.println(-1);
                
        }
    }
}