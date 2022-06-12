import java.util.*;
public class subpalindromes{

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String[] str=s.nextLine().split("");
	int n=str.length;
	int c,cn=0;
	for(int i=0;i<n;i++){
	    for(int j=i+1;j<n;j++){
	        if(str[i].equals(str[j])){
	            c=-1;
	            for(int k=i,l=j;k<=j && l>=i;k++,l--){
	                if(str[k].equals(str[l])){
	                    c++;
	                }
	            }
	            if(c==(j-i))
	            {
	                cn++;
	            }
	        }
	    }
	    
	}
	System.out.print(cn);

	}
}
    

