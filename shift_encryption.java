import java.util.*;
public class shift_encryption {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char[] ch=s.nextLine().toCharArray();
		int x=s.nextInt();
		int y=s.nextInt();
                int n=0;
		for(int i=0;i<ch.length;i++){
		    if(Character.isLetter(ch[i])){
		    ch[i]=(char)((((int)ch[i]+x-97)%26)+97);
		        System.out.print(ch[i]);
		        
		    }
		    else if(Character.isDigit(ch[i])){
		         n=(Integer.parseInt(String.valueOf(ch[i]))+y);
		         System.out.print(n);
		    }
		    else{
		        System.out.print("  ");
		    }
		    
                }
    }
}



