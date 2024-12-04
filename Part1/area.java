import java.util.*;
class cube 
{
	Float H;
	Float W;
	Float D;
	Float claar(Float h,Float w, Float d)
	{
		H=h;
		W=w;
		D=d;
	return H*W*D;
	}
}
public class area 
{
	public static void main(String[] args) {
		cube c = new cube();
		cube c1 = new cube();
		System.out.println("1st Area"+c.claar(20f,40f,80f));
		System.out.println("2nd Area"+c1.claar(200f,400f,800f));	
	}
}