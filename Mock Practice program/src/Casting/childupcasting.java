package Casting;

public class childupcasting extends Parent
{
	int a=20;
	int d=30;
	public void farm()
	{
		System.out.println("Child farm is=05 acres");
	}
	public void car()
	{
		System.out.println("child car=01");
	}
	public void sum()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		Parent p=new childupcasting();
		p.farm();
		p.house();
		
		
		
		System.out.println(p.a);
		System.out.println(p.b);
	
		
	}

}
