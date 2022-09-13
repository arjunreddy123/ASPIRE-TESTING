package StringS;

public class String1 
{

	public static void main(String[] args)
	{
		String a="Aspire Training Insstitute Pune";
        String b="aspire";
        String s="";
        System.out.println(a.charAt(5));
        System.out.println(a.indexOf("n"));
        System.out.println(a.lastIndexOf("e"));
        
        System.out.println(a.endsWith("Pune"));
        System.out.println(a.startsWith("Aspire"));
        
        System.out.println(a.contains("Training"));
        System.out.println(a.substring(5));
        System.out.println(a.substring(5,8));
        
        System.out.println(a.concat(" "+b));
        String c=a.replace("Pune", "Delhi");
        System.out.println(c);
        //System.out.println(a.replace("aspire","u"));
	}

}
