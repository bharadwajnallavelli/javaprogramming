import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter subject1 marks:");
		Scanner scan = new Scanner(System.in);
		double subject1 = scan.nextDouble();
		System.out.println("enter subject2 marks");
		Scanner scan1 = new Scanner(System.in);
		double subject2 = scan1.nextDouble();
		if((subject1 >= 35) && (subject2 >=35))
		{
			System.out.println("You passed in this semester");
		}
		else
		{
			System.out.println("You failed in this semester");
			System.out.println("The failed subjects are:");
			if(subject1 < 35)
			{
				System.out.println(" subject1:\t"+ subject1);
			}
			else
			{
			}
			if(subject2 < 35)
			{
				System.out.println(" subject2:\t"+ subject2);
				
			}
			else
			{
				
			}
		}
		}

	}