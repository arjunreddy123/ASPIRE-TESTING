package casting;

public class Testclass
{

	public static void main(String[] args)
	{
		parent p=new child();
		p.farm();
		p.house(); 
		System.out.println(p.a);  //paarent farm n house
		                          //child farm n car
		
	}

}
