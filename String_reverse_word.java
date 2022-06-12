import java.util.*;
public class String_reverse_word {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] str=s.nextLine().split("\\s+");
		for(int i=str.length-1;i>=0;i--)
		{
		    System.out.print(str[i]+" ");
		}

	}
}
