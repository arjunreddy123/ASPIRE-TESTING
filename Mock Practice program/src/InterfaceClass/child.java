package InterfaceClass;

public class child implements Interface1,Interface2
{

	@Override
	public void car() 
	{
		System.out.println("Child Car=01");
		
	}

	@Override
	public void farm() 
	{
		System.out.println("Child Farm=10acres");
		
	}

	@Override
	public void bunglow() 
	{
		System.out.println(" child Bunglow=01");
		
	}

	@Override
	public void gold() 
	{
		System.out.println("child Gold=100gn");
		
	}

}
