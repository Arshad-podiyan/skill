import java.util.stream.*;
import java.util.*;
public class series_team_score {
 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a=Stream.of(s.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int[] b=Stream.of(s.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int teama=0;
		int teamb=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==b[i]){
                teama+=1;
                teamb+=1;
            }
            else if(a[i]>b[i]){
                teama+=3;
            }
            else{
                teamb+=3;
            }
        }
        System.out.print(teama+" "+teamb);
         
	}
}