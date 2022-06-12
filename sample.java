import java.util.*;
public class sample {

    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str="credit 1 lakh";
		String[] arr=str.split(" ");
		int a=3;
		int b=0;
                                 boolean space=false;
		for(int i=0;i<arr.length;i++){
                    if(space){
                                                System.out.print("\t");}
		    char ch[]=arr[i].toCharArray();
		    for(int j=0;j<ch.length;j++){
                                                 space=true;
		        if(ch[j]>='a' && ch[j]<='z'){
		            ch[j]+=a;
                                                      System.out.print(ch[j]);
                		        }else if(ch[j]>='0' && ch[j]<='9'){
		            int s=Integer.parseInt(String.valueOf(ch[j]))+b;
		            System.out.print(s);
		       
		        }
		    }
		
		}
	}
}