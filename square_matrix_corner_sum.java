import java.util.*;
public class square_matrix_corner_sum {
    
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		int[][] mat=new int[a][a];
		for(int i=0;i<a;i++){
		    for(int j=0;j<a;j++){
		        mat[i][j]=s.nextInt();
		        if((i==0 && j==0) || (i==0 && j==a-1) || (i==a-1 && j==0) || (i==a-1 && j==a-1)){
		            sum+=mat[i][j];
		        }
		    }
		}
		System.out.print(sum);

	}
}
