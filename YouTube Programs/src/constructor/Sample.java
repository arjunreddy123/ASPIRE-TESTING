package constructor;
public class Sample 
{
	int a; //instance => non static
	int b;
	Sample()
	{
		
	}
	Sample(int c, int d)
	{
		System.out.println("Im am Parent constructor");
		int x=c;
		int y=d;
		int z=x+y;
		System.out.println("parent construtor="+z); 
		
	}
	void show()
	{    
		System.out.println(a+" "+b);
	}
	public void addition()
	{
		int add=a+b;
		System.out.println("Adition of a& b ="+add);
		
	}
	public void multiplication()
	{
		int multi=a*b;
		System.out.println("Multiplication of a&b ="+multi);
	}
}
