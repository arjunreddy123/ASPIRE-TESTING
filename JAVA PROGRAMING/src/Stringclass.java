
public class Stringclass 
{

	public static void main(String[] args) 
	{
		String str="arjun Reddy";
		String str2="Arjun Reddy";
		int l=str.length();
		System.out.println(str.toUpperCase());// lowercase k liye str.lowercase likho
		System.out.println(l);
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
