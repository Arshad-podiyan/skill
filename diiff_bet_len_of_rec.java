import java.util.*;
import java.util.stream.*;
public class diiff_bet_len_of_rec {
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int[] rs=Stream.of(s.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
	 int[] wid=Stream.of(s.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
	 double alen=rs[0]/5;
	 double tim=rs[1]/5;
	 double alength=alen/wid[0];
	 double tlength=tim/wid[1];
	 System.out.printf("%.2f",Math.abs(tlength-alength));

	}
}