package basics;
//import scanner util package
import java.util.Scanner;
//class creation
class Bank{
	long accountnumber;
	String name;
	float amount;
	void setinfo(long accnum,String Name,float amt){
		accountnumber = accnum;
		name = Name;
		amount = amt;
	}
	void displayinfo()
	{
		System.out.println("The customer info is:");
		System.out.println("accountnumber: "+ accountnumber);
		System.out.println("Name: "+name);
		System.out.println("Available balance is: "+amount);
	}
	void deposit(float amt){
		amount=amount+amt;
		System.out.println("deposited is: "+amt);
		System.out.println("toatal balance is: "+amount);
	}
	void withdraw(float amt){
		if(amount<amt)
		{
			System.out.println("You have insufficient balance in your account");
			System.out.println("balance available is:"+amount);
		}
		else{
			amount=amount-amt;
			System.out.println("withdraw amount is"+amt);
			System.out.println("Available balance is: "+amount);
		}
	}
}


public class SimpleBanking {

	public static void main(String[] args) {
		// choices
		System.out.println("choose your choice: ");
		System.out.println("1.display account information");
		System.out.println("2.deposit");
		System.out.println("3.withdraw");
		
		//scanner object files
		Scanner sc = new Scanner(System.in);
		Scanner ac = new Scanner(System.in);
		Scanner na = new Scanner(System.in);
		Scanner am = new Scanner(System.in);
		
		
		//object files for class
		Bank b = new Bank();
		b.setinfo(20244173, "Bharadwaj", 40000);
		int c = sc.nextInt();//choice
		switch(c)
{
		
		case 1: System.out.println("the information of the account is: ");
		b.displayinfo();
		break;
		case 2: System.out.println("Enter the amount to deposit: ");
		float am2 = am.nextFloat();
		b.deposit(am2);
		break;
		case 3: System.out.println("Enter the amount to withdraw:");
		float am3 = am.nextFloat();
		b.withdraw(am3);
		break;
		default: System.out.println("you entered wrong choice ");
		break;
		
}
	}

}
