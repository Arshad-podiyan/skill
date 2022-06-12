import java.util.*;
public class print_the_date_for_day {
      public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] days={"MON","TUE","WED","THU","FRI","SAT","SUN"};
		String day=s.nextLine();
		int d=s.nextInt();
		int date=d+Arrays.asList(days).indexOf(day);
		if(date%7==0)
		    System.out.print("SUN");
		else if(date%7==1)
		      System.out.print("MON");
	    else if(date%7==2)
	          System.out.print("TUE");
	    else if(date%7==3)
	          System.out.print("WED");
	    else if(date%7==4)
	          System.out.print("THU");
	    else if(date%7==5)
	          System.out.print("FRI");
	     else if(date%7==6)
	           System.out.print("SAT");
	          

	}
}

