package Interview;

public class Sample 
{
int a=10,b=20,sum;
public void add()
{
	sum=a+b;
	System.out.println("Sum is="+sum);
}
public void add(int x)
{
	sum=a+x;
	System.out.println("Sum is="+sum);
}
public void add(int x,int y)
{
	long sum=x+y;
	System.out.println("Sum is="+sum);
}
public void add(int x,int y ,float z)
{
	float sum=x+y+z;
	System.out.println("Sum is="+sum);
}
public static void main(String[] args) 
{
	Sample s=new Sample();
	s.add();
	s.add(25);
	s.add(50, 20);
	s.add(10, 20, 20);
}

}
