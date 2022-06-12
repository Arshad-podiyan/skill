import java.util.*;
public class Alternate_charac {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char[] ch=s.nextLine().toCharArray();
		boolean upper=true;
		boolean lower=false;
		boolean space=true;
		for(int i=0;i<ch.length;i++){
		    if(Character.isLetter(ch[i])){
		      if(space){
		         upper=true;
		          if(upper){
		        
		        System.out.print(Character.toUpperCase(ch[i]));
		        upper=false;
		        lower=true;
		        space=false;
		        
		    }
		  }
		   else if(lower){
		        System.out.print(Character.toLowerCase(ch[i]));
		        lower=false;
		        upper=true;
		        space=true;
		    }
		    }
		    else{
		        System.out.print(" ");
		        space=true;
		    }
		}

	}
}