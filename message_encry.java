import java.util.*;
public class message_encry {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String[] str=s.nextLine().split("");
	int n=s.nextInt();
	int n1=str.length/n;
	int k=0;
	String[][] arr=new String[n1][n];
	for(int i=0;i<n1;i++){
	        if(i%2==0){
	        for(int j=0;j<n;j++){
	        arr[i][j]=str[k++];
	         }
	        }
	         else{
	             for(int j=n-1;j>=0;j--){
	                 arr[i][j]=str[k++];
	             }
	        }
}
for(int i=0;i<n;i++){
    for(int j=0;j<n1;j++){
        System.out.print(arr[j][i]);
    }
    //System.out.print("\n");
}

	}
}