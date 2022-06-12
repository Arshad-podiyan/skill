import java.util.*;
public class odd_len_str_dia_pattern {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] str=s.nextLine().split("");
		int n=str.length;
		for(int i=0;i<n;i++){
		    int j=n-1-i;
		    for(int k=0;k<n;k++){
		        if(k==i || k==j){
		            System.out.print(str[k]);
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.print("\n");
		}

	}
}
  
