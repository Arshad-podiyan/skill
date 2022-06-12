import java.util.*;
public class concat_String_Alp {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		int n1=str1.charAt(0);
		int n2=str2.charAt(0);
		if(n1<n2){
		    System.out.print(str1+str2);
		}
		else{
		    System.out.print(str2+str1);
		}

	}
}