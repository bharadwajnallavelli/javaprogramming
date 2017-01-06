package Packages;
class Sample{
	void display(){
		
	}
	void display(int a){
		System.out.println(a);
	}
	void display(double a,double b){
		System.out.println(a*b);
	}
}

public class TwoMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample sam = new Sample();
sam.display();
sam.display(42);
sam.display(12.0,11.0);

	}

}
