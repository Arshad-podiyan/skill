import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class demo {
    public static void main(String[] args) {
        	Scanner s=new Scanner(System.in);
                    String a=s.nextLine();
                    int index=0;
                    List<Integer> list=new ArrayList<Integer>();
                    Pattern p=Pattern.compile("\\d+");
                    Matcher m=p.matcher(a);
                    while(m.find()){
                    list.add(Integer.parseInt(m.group()));
                    }
                    Pattern st=Pattern.compile("[A-Za-z]");
                    Matcher stm=st.matcher(a);
                    while(stm.find()){
                        for(int i=1;i<=list.get(index);i++){
                            System.out.print(stm.group());
                            
                        }
                        index++;
                    }
                    
    }
}