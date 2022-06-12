import java.util.*;
public class Charaecter_At_Multipile_of_x {
   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=s.nextInt();
        for(int i=n;i<=str.length();i+=n){
            System.out.print(str.charAt(i-1));
            
        }

	}
}