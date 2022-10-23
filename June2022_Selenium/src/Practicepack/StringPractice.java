package Practicepack;

public class StringPractice 
{

	public static void main(String[] args) 
	{
		String b="arjun";
		String d="arjun";
		String a="arjun pandurang ugile";
		String s="Vaishli Muskawad";
		String w="Arnav arjun ugile udgir";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.equals(a));
		System.out.println(b.equalsIgnoreCase(d));
		System.out.println(s.length());
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("p"));
		System.out.println(w.lastIndexOf("u"));
		System.out.println(w.contains(b));
		System.out.println(b+" ".concat(s)+" ");
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 7));
		System.out.println(b.replace("a", "A"));
		
		String[] word = w.split(" ");
		String revword="";
		for(String Q:word) 
		{
			StringBuilder sb=new StringBuilder(Q);
			sb.reverse();
			revword=revword+sb.toString()+" ";
	    }
        System.out.println(revword);
        for(int i=d.length()-1;i>=0;i--)
        {
        	System.out.print(d.charAt(i));
        }
}
}