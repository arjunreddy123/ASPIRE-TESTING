package StringS;
public class Stringclass 
{

	public static void main(String[] args) 
	{
		String str="arjun Reddy";
		String str2="Arjun Reddy";
		
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
	
		//or second metod if else use
		if(str==str2)
		{
			System.out.println("Both Are Equals");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}

}
