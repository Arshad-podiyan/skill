import java.util.*;
public class odd_length_middle_three_letter {
    
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=(str.length()/2)-1;
		for(int i=n;i<=n+2;i++){
		    System.out.print(str.charAt(i));
		}

	}
}
    

