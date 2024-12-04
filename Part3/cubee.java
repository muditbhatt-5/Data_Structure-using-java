import java.util.*;
class cube1
{
	double heigth;
	double width;
	double dept;
	public double area(double h,double w,double d)
	{
		heigth=h;
		width=w;
		dept=d;
		return h*w*d;
	}
}
public class cubee
{
	public static void main(String[] args) {
		cube1 c1 = new cube1();
		double area= c1.area(10.0,10.0,10.0);
		System.out.println("Area Is :: "+area);
	}
}