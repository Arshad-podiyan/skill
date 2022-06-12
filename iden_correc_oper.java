import java.util.*;
import java.util.regex.*;
public class iden_correc_oper {

   public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher(str);
		int[] n=new int[3];
		int i=0;
		while(m.find()){
		    n[i]=Integer.parseInt(m.group());
		    i++;
		}
		if((n[0]+n[1])==n[2]){
		    System.out.print("+");
		}
		else if((n[0]-n[1])==n[2]){
		    System.out.print("-");
		}
		else if((n[0]*n[1])==n[2]){
		    System.out.print("*");
		}
		else{
		    System.out.print("/");
		}

	}
}