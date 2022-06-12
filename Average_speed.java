import java.util.*;
import java.util.stream.*;
public class Average_speed {
  public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double[] spd=Stream.of(s.nextLine().split("[@\\s]")).mapToDouble(Float::parseFloat).toArray();
		int n=spd.length;
		double sum1=0,sum2=0;
		for(int i=0,j=1;j<n;i+=2,j+=2){
		    sum1+=spd[i];
		    sum2+=spd[j];
		    
		}
                //System.out.println(sum1);
                // System.out.println(sum2);
                
		System.out.printf("%.2f kmph",sum1/sum2); 

	}
}