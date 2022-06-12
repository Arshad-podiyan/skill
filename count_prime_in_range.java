import java.util.*;
public class count_prime_in_range {
       public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=0,cn=0;
		for(int i=a;i<=b;i++){
		    c=0;
		    for(int j=1;j*j<=i;j++){
		        if(i==1){continue;}
		        if(i%j==0){
		            c++;
		        }
		    }
		    if(c==1){
		        cn++;
		    }
		}
		System.out.print(cn);

	}
}