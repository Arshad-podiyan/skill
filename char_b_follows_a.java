import java.util.*;
import java.util.regex.*;
public class char_b_follows_a {
      public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=0;
		String st=s.nextLine();
		String str1=s.nextLine();
		String str2=s.nextLine();
		String mat=str1+str2;
		Pattern p=Pattern.compile(mat);
		Matcher m=p.matcher(st);
		while(m.find()){
		    c++;
		}
		System.out.print(c);

	}
}

