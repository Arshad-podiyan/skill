import java.util.*;
import java.util.stream.*;
public class Arith_prog_nth {
 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] n=Stream.of(s.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int m=s.nextInt();
		int a=n[1]-n[0];
		int i=1;
		while(i>0){
		    
		    if(i==m){
		        System.out.print(n[0]);
		        break;
		    }
                                         n[0]+=a;
		    i++;
		    
		}
		

	}
}