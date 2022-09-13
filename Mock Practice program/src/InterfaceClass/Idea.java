package InterfaceClass;

public class Idea implements Telecom
{

	@Override
	public void calling() 
	{
		System.out.println("200rs per month 1p/s plan");
		
	}

	@Override
	public void sms()
	{
		System.out.println("Monthly plan 1000 sms");
		
		
	}

	@Override
	public void internet() 
	{
		System.out.println("Per day1.5GB");
		
		
	}

}
