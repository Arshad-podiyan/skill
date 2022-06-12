import java.util.*;
import java.util.stream.*;
public class  Array_product_except_index {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr=Stream.of(s.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int n=arr.length;
		int[] newarr=new int[n];
		int p=1;
		for(int i=0;i<n;i++){
                                             p=1;
		    for(int j=0;j<n;j++){
		        if(i==j){
		            continue;
		        }
		        p*=arr[j];
		        
		    }
		   // newarr[i]=p;
		    System.out.print(p+" ");
		}
//
//	for(int k=0;k<n;k++){
//		    System.out.print(newarr[k]+" ");
//		}

	}
}
