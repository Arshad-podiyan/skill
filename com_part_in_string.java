import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String res="";
		for(int i=0;i<str1.length();i++){
		    int n=i;
		    res="";
		    if(str1.charAt(n)==str2.charAt(0)){
		        for(int j=0;j<str2.length();j++){
		            if(str1.charAt(n)==str2.charAt(j)){
		                res+=(str2.charAt(j)+"");
		                n++;
		                if(n==str1.length()){
		                    System.out.print(res);
		                    return;
		                }
		            }
		            else{
		                break;
		            }
		        }
		    }
		    
		  	
		 }

	}
}