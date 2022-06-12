import java.util.*;
public class arrange_alp_desc {
 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ci=0;
		char[] ch=s.nextLine().toCharArray();
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<ch.length;i++){
		   // int asci=ch[i];
		    int hindex=i;
		    for(ci=i+1;ci<ch.length;ci++){
		      int  asci=ch[hindex];
		        int casci=ch[ci];
		        if(casci>asci){
		            hindex=ci;
		        }
		    }
		        char temp=ch[i];
		        ch[i]=ch[hindex];
		        ch[hindex]=temp;
		        
		}
		        for(int i=0;i<ch.length;i++){
		            String f=sb.toString();
		            if(f.contains(String.valueOf(ch[i]))){
		                continue;
		            }
		            else{
		            sb.append(ch[i]);
		        }
		        }
		        System.out.print(sb.toString());
	

	}
}

