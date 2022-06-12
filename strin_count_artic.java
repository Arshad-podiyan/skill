import java.util.*;
import java.util.regex.*;
public class strin_count_artic {
       public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		Pattern p=Pattern.compile("\\b(a|an|the)\\b");
		Matcher m=p.matcher(str);
		int c=0;
		while(m.find()){
		   		    c++;
		}
		System.out.print(c);
		
		

	}
}