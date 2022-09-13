package InterfaceClass;

public class Grandchild extends child2
{

	@Override
	public void bunglow() 
	{
		System.out.println("Grandchild bunglow=03");
	}

	@Override
	public void gold() 
	{
	  System.out.println("grindchild Gold=500gm");
	}
public static void main(String[] args) 
{
	Grandchild g=new Grandchild();
	g.farm();
	g.bunglow();
	g.gold();
	g.car();
	g.gold();
	
}
}
