import java.util.*;
public class First_letter_in_word_uppercase {
   public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] ch=str.toCharArray();
		boolean space=true;
		for(int i=0;i<str.length();i++){
		    if(Character.isLetter(ch[i])){
		        if(space){
		            ch[i]=Character.toUpperCase(ch[i]);
		            space=false;
		        }
		    }
		    else{
		        space=true;
		    }
		}
		String charr=String.valueOf(ch);
		System.out.print(charr);

	}
}