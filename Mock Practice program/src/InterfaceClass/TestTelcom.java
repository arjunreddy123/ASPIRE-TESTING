package InterfaceClass;

public class TestTelcom 
{

	public static void main(String[] args)
	{
		
		System.out.println("***JIO***");
		Jio  j=new Jio();
		j.calling();
		j.sms();
		j.internet();
		System.out.println("***IDEA***");
		Idea i=new Idea();
		i.calling();
		i.sms();
		i.internet();
	}

}
