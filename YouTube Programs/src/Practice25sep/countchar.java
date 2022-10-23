package Practice25sep;

public class countchar 
{

	public static void main(String[] args) 
	{
		String s="Hi Wel-come To @Class @7.00am !";
		char[] ch = s.toCharArray();
		
		
		int countupper=0;
		int countlower=0;
		int countnumber=0;
		int countspecialchar=0;
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			
		    if(ch[i]>='a'&&ch[i]<='z')
				countlower++;
			else if(ch[i]>='A'&&ch[i]<='Z')
			   countupper++;
			else if(ch[i]>='0'&&ch[i]<='9')
				countnumber++;
			else if(ch[i]>=' ')
				count++;
			else
				countspecialchar++;
		}
		System.out.println("countlower="+countlower);
		System.out.println("countupper="+countupper);
		System.out.println("countnumber="+countnumber);
		System.out.println("countspecialchar="+countspecialchar);
}
}
