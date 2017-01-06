package Packages;
class Rec{
	int fact(int n){
		int result;
		if(n==1) return 1;
		result = fact(n-1)*n;
		return result;
	}
}

public class RecTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rec f = new Rec();
System.out.println(f.fact(5));
	}

}
