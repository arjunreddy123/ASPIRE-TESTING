package Inheritance;

public class Temporary_Staff 
{
	int day;
	int hourworked;
	
	Temporary_Staff(int m,String n,int b,int c)
	{
		//super(m,n) ;
		day=b;
		hourworked=c;
	}
	void display()
	{
		//super.display();
		System.out.println("days="+day);
		System.out.println("hourworked="+hourworked);
		
	}
	void salary()
	{
		int salary;
		salary=day*hourworked*50;
		System.out.println("salary="+salary);
	}

	public static void main(String[] args) 
	{
		
		Temporary_Staff obj3=new Temporary_Staff(1,"shailesh",10,80);
		obj3.display();
		obj3.salary();
	}

	
}
