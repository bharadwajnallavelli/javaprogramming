package learingjava;

import java.util.Scanner;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the student progress report");
		int star =1;
		while(star < 50)
		{
			System.out.print("*");
			star++;
		}
		System.out.println("");
		int studentmarks[][];
		studentmarks = new int[2][4];
		studentmarks[0][0] = 93;
		studentmarks[0][1] = 88;
		studentmarks[0][2] = 78;
		studentmarks[0][3] = 80;
		studentmarks[1][0] = 91;
		studentmarks[1][1] = 86;
		studentmarks[1][2] = 77;
		studentmarks[1][3] = 79;
		System.out.println("Enter the last three digits of student id to get the marks:");
		Scanner sid = new Scanner(System.in);
		long studentid = sid.nextLong();
		if(studentid == 613)
		{
			System.out.println("Score of the Bharadwaj is:\t");
			System.out.println("Computing 4 marks is:\t"+studentmarks[0][0]);
			System.out.println("Computer architecture marks is:\t"+studentmarks[0][1]);
			System.out.println("Gui 1 marks is:\t"+studentmarks[0][2]);
			System.out.println("Software Engineering 2 marks is:\t"+studentmarks[0][3]);
		}
		else if(studentid == 615)
		{
			System.out.println("Score of the Satwik is:\t");
			System.out.println("Computing 4 marks is:\t"+studentmarks[1][0]);
			System.out.println("Computer architecture marks is:\t"+studentmarks[1][1]);
			System.out.println("Gui 1 marks is:\t"+studentmarks[1][2]);
			System.out.println("Software Engineering 2 marks is:\t"+studentmarks[1][3]);
		}
		else
		{
			System.out.println("There is no studentid registered with your entered number try again:");
		}
		
		

	}
}

	