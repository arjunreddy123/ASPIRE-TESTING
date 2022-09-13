package StringS;

public class Sample2 
{

	public static void main(String[] args) 
	{
		String a="";
		String b="Aspire";
		
		String d="Aspire Training Institute Pune ";
        String e="Mumbai";
        
        System.out.println(d+" ");
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(d.length());
        System.out.println(a.isEmpty());
        System.out.println(d.contains(b));
        System.out.println(d.indexOf("P"));
        System.out.println(d.lastIndexOf("u"));
        System.out.println(d.concat(e));
        
        System.out.println((d.toUpperCase().contains(e.toUpperCase())));
        
	}

}
