package javaprogramming;

import java.util.Scanner;

class Box{
	double width;
	double height;
	double depth;
}

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box mybox = new Box();
System.out.println("To calculate the Box volume enter the details:");
System.out.println("Box1 depth:");
Scanner scan1 = new Scanner(System.in);
mybox.depth = scan1.nextDouble();
System.out.println("Box1 width:");
Scanner scan2 = new Scanner(System.in);
mybox.width = scan2.nextDouble();
System.out.println("Box1 height:");
Scanner scan3 = new Scanner(System.in);
mybox.height = scan3.nextDouble();
double volume = mybox.depth*mybox.width*mybox.height;
System.out.println("Volume of the Box is:"+volume);


	}

}
