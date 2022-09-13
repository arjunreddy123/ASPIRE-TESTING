package Collections_Set;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_1 
{

	public static void main(String[] args) 
	{

		TreeSet ts=new TreeSet();
		ts.add("Arjun");
		ts.add("Ugile");
		//ts.add(987654321);
		//ts.add(92.56);
		//ts.add(null);
		//ts.add('A');
		//ts.add(true);
		ts.add("Ugile");
		ts.add("vaishali");
		//ts.add(null);
		//ts.add(null);
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		
		ts.remove("Arjun");
		
		for(Object i:ts)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

	}

	}


