import java.util.*;
public class rotate_string_n_pos {
    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	int p=s.nextInt();
	System.out.print(str.substring(str.length()-p));
	System.out.print(str.substring(0,str.length()-p));
	}
}
