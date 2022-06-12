import java.util.*;
import  java.util.stream.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Skill {

    public static void main(String[] args) {
        	Scanner s=new Scanner(System.in);
		String str=s.nextLine();
                                          char pr;
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String rev=sb.toString();
                                          char[] ch=rev.toCharArray();
                                          List<String> list=new ArrayList<String>();
                                          
                                          for(char c:ch){
                                              list.add(String.valueOf(c));
                                          }
                                          for(int i=0;i<str.length();i++){
                                              if(Collections.frequency(list,list.get(i))>=2){
                                                  System.out.print(list.get(i));
                                                  break;
                                                  
                                              } 
                    
                                          }
                                          
                
	}
}