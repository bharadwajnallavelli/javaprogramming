package calci;

import java.util.Scanner;

class calci1{
	 double num1;
	 double num2;
	double add(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
		double value = num1+num2;
		System.out.println("The sum is:"+value);
		return value;
	
	}
	double sub(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
		double value = num1-num2;
		System.out.println("The sum is:"+value);
		return value;
	}
	double mul(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
		double value = num1*num2;
		System.out.println("The sum is:"+value);
		return value;
	}
	double div(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
		double value = num1/num2;
		System.out.println("The sum is:"+value);
		return value;
	}
}


public class Calculator {

	public static void main(String[] args) {
		calci1 obj= new calci1();
		System.out.println("Simple calculator using classes and methods");
		System.out.println("1:Addition");
		System.out.println("2:Subtraction");
		System.out.println("3:Multiplication");
		System.out.println("4:Division");
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt(); 
		switch(ch){
		case 1:
			System.out.println("Enter the number1 and number2 value for sum");
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			double a = scan1.nextDouble();
			double b = scan2.nextDouble();
			obj.add(a, b);
			break;
		case 2:
			System.out.println("Enter the number1 and number2 value for subtraction");
			Scanner scan3 = new Scanner(System.in);
			Scanner scan4 = new Scanner(System.in);
			double c = scan3.nextDouble();
			double d = scan4.nextDouble();
			obj.sub(c, d);
			break;
		case 3:
			System.out.println("Enter the number1 and number2 value for Multiplication");
			Scanner scan5 = new Scanner(System.in);
			Scanner scan6 = new Scanner(System.in);
			double e = scan5.nextDouble();
			double f = scan6.nextDouble();
			obj.mul(e, f);
			break;
		case 4:
			System.out.println("Enter the number1 and number2 value for Division");
			Scanner scan7 = new Scanner(System.in);
			Scanner scan8 = new Scanner(System.in);
			double g = scan7.nextDouble();
			double h = scan8.nextDouble();
			obj.div(g, h);
			break;
		 default:
			 System.out.println("You selected the wrong choice sorry!!!");
			 break;
			
		}
		
	}

}
