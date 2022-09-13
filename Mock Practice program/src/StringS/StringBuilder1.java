package StringS;

public class StringBuilder1 
{
public static void main(String[] args) 
{
        String s="Arjun ugile latur";
        String[] word = s.split(" ");
        String revword="";
        for(String w:word)
        {
        	StringBuilder sb=new StringBuilder(w);
        	sb.reverse();
        	revword=revword+sb.toString()+" ";
        }
        System.out.println(revword);
}
}
