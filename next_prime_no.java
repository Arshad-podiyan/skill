import java.util.*;
public class next_prime_no {
   public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		n+=1;
		int i=1,c=0,cn=0;
		while(i>0){
		    c=0;
		    for(int j=1;j*j<=n;j++){
		        if(n%j==0){
		            c++;
		        }
		    }
		        if(c==1){
		            break;
		        }
		    n++;
		}
System.out.print(n);
	}
}