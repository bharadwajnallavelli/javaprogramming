package learingjava;

import java.util.Scanner;

public class SampleTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			      int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			      System.out.println("To know how many days are in a month enter the number between 1 and 12");
			      Scanner scan = new Scanner(System.in);
			      int month_select = scan.nextInt();
			      switch(month_select)
			      {
			      case 1:
			    	  System.out.println("January has:"+ month_days[0]);
			    	  break;
			      case 2:
			    	  System.out.println("February has:"+ month_days[1]);
			    	  break;
			      case 3:
			    	  System.out.println("March has:"+ month_days[2]);
			    	  break;
			      case 4:
			    	  System.out.println("April has:"+ month_days[3]);
			    	  break;
			      case 5:
			    	  System.out.println("May has:"+ month_days[4]);
			    	  break;
			      case 6:
			    	  System.out.println("June has:"+ month_days[5]);
			    	  break;
			      case 7:
			    	  System.out.println("July has:"+ month_days[6]);
			    	  break;
			      case 8:
			    	  System.out.println("August has:"+ month_days[7]);
			    	  break;
			      case 9:
			    	  System.out.println("September has:"+ month_days[8]);
			    	  break;
			      case 10:
			    	  System.out.println("October has:"+ month_days[9]);
			    	  break;
			      case 11:
			    	  System.out.println("November has:"+ month_days[10]);
			    	  break;
			      case 12:
			    	  System.out.println("December has:"+ month_days[11]);
			    	  break;
			      default: 
			    	  System.out.println("January has:\t"+ month_days[0]);
			    	  System.out.println("February has:\t"+ month_days[1]);
			    	  System.out.println("March has:\t"+ month_days[2]);
			    	  System.out.println("April has:\t"+ month_days[3]);
			    	  
			    	  System.out.println("May has:\t"+ month_days[4]);
			    	 
			    	  System.out.println("June has:\t"+ month_days[5]);
			    	  
			    	  System.out.println("July has:\t"+ month_days[6]);
			    	 
			    	  System.out.println("August has:\t"+ month_days[7]);
			    	
			    	  System.out.println("September has:\t"+ month_days[8]);
			    	 
			    	  System.out.println("October has:\t"+ month_days[9]);
			    	 
			    	  System.out.println("November has:\t"+ month_days[10]);
			    	 
			    	  System.out.println("December has:\t"+ month_days[11]);
			    	  break;
			    	  
			    	  
			      }

	}

}
