package Inheritance;

public class Staff_ID extends Person
{
	int staffid;
	Staff_ID(int m, String n)
	{
		super(n);
		staffid=m;
	}
	void display()
	{
		super.display();
		System.out.println("staffid="+staffid);
	}
}
