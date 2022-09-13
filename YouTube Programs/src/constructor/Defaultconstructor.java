package constructor;

public class Defaultconstructor 
{

	int a;
	float b;
	char c;
	boolean d;
	String e;
	public void method()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
	
	public static void main(String[] args) 
	{
		Defaultconstructor object=new Defaultconstructor ();
		object.method();
		
	}

}
