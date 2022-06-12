import java.util.*;
public class min_dis_bet_words {

    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String[] arr=s.nextLine().split("\\s");
String str1=s.nextLine();
String str2=s.nextLine();
int index1 = -1;
int index2 = -1;
int small= Integer.MAX_VALUE;
int c = 0;

for (int x = 0; x < arr.length; x++) {
    if (arr[x].equals(str1)) {
        index1 = x;
    }
    if (arr[x].equals(str2)) {
        index2 = x;
    }
    if (index1 != -1 && index2 != -1) { 
        c = Math.abs(index2 - index1);
        if (c < small) {
            small= c;
        }
    }
}
if(small==0){
    System.out.print(1);
}
else{
System.out.println(small);
        }
}
}

  
 
    
