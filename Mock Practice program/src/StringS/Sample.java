package StringS;

public class Sample 
{

	public static void main(String[] args) 
	{
		String a="Aspire";                //create object without using new keuword
		String b=new String ("Aspire");   // create object using new keyword
		String c="Aspire";
		String d=new String("Aspire");
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		String e="aspire";
		
		System.out.println(a.equals(e));
		System.out.println(a.equalsIgnoreCase(e));
	}

}
