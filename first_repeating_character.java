import java.util.*;
public class first_repeating_character {
      public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] ch=str.toCharArray();
		List<Character> list=new ArrayList<Character>();
		for(char c:ch){
		    list.add(c);
		}
		for(int i=0;i<list.size();i++)
		{
		    if(Collections.frequency(list,list.get(i))>=2){
		        System.out.print(list.get(i));
		        break;
		    }
		}

      }
}
