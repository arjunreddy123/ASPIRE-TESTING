package constructor;

public class Demo 
{ 
	int a,b,c,y;
	float k,x;
	
	public Demo()
	{

	}

	public Demo(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}

	public Demo(int c,float k)
	{
		this.c=c;
		this.k=k;
	}

	public Demo(float x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(x*y);
		System.out.println(c+k);
		
	}
	
   public static void main(String[] args) 
	{
		Demo r=new Demo();
		
		Demo r1=new Demo(10,20);
		r1.show();
		Demo r2=new Demo(20,10.0100f);
		r2.show();
		
		Demo r3=new Demo(10.010f,900);
		
		r3.show();
		
		

	}

}
