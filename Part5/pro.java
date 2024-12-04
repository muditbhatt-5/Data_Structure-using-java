import java.util.*;
class product
{
	int item;
	public void put(int item)
	{
		System.out.println("put item:"+item);
	}
	public int get(int item)
	{
		System.out.println("get item:"+item);
		return item;
	}
}
class product1 extends Thread
{
	product p1;
	public product1(product p1)
	{
		this.p1=p1;
		start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			p1.put(i);
			try 
			{
						System.out.println("Product1");
						Thread.sleep(1000);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
				System.out.println("exception occur");
			}
		}
	}
}
class consumer extends Thread
{
		product1 p1;
		int g;
		consumer(product1 p1)
		{
			this.p1=p1;
			start();
		}
		public void run(product1 p1)
		{
			for(int i=0;i<5;i++)
			{
				g=p1.get(i);
				try 
				{
					System.out.println("Pro2");
					Thread.sleep(3000);
				}
				catch(Exception e)
				{
					System.out.println("exception2 occur");
				}
			}
		}
}
public class pro
{
	public static void main(String[] args)
	{
		product prod = new product();
		product1 P1 =new product1(prod);
		consumer c = new consumer(prod); 
	}
}