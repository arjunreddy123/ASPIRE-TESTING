package StringS;

public class CharrayArray {

	public static void main(String[] args) 
	{
		String s="Arjun ugile";
		char[] ch = s.toCharArray();
		int len=ch.length;
		System.out.println("charArray length="+len);
		 for (int i = 0; i < len; i++) 
		 {  
	            System.out.print(ch[i]);  
	     }  

	}

}