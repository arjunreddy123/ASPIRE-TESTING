package Practice25sep;

import java.util.HashMap;

public class HashMap1
{

	public static void main(String[] args) 
	{
	  String str=" My name is IBMer";
	  String[] str1=str.split(" ");
	
	HashMap<String, Integer> map=new HashMap<String,Integer>();
	
	for(int i=1;i<str1.length;i++)
	{
		if(map.containsKey(str1[i]))
		{
		  int count=map.get(str1[i]);
		  map.put(str1[i], count+1);
		}
		else
		{
			map.put(str1[i], 1);
		}
		
	}
	//System.out.print(map);
	System.out.println();
	System.out.println("Result="+map.size());

	}
}




