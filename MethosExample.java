package Packages;
class Box {
	double width;
	double height;
void volume(double w, double h)
{
	width = w;
	height = h;
}
double volume1()
{
	return width*height;
}
}

public class MethosExample {

	public static void main(String[] args) {
		double vol;
		
		Box mybox = new Box();
		mybox.volume(12, 4);
		vol = mybox.volume1();
		System.out.println(vol);
		

	}

}
