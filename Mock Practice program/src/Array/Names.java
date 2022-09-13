package Array;

public class Names 
{

	public static void main(String[] args) 
	{
		
		 
		
		    int[] vipno = {111, 222, 333, 444, 555};
		 
		    System.out.println("Accessing Elements of Array:");
		    System.out.println("First Element:"+vipno[0]);
		    System.out.println("Second Element:"+vipno[1]);
		  
		    // create an array                                       // loop through the array
		    int[] age = {12, 4, 5,7,9};                                 // using for loop
		    System.out.println("Using for Loop:");
		    for(int i = 0; i <age.length; i++) 
		    {
		     System.out.print(age[i]+",");
	        }
		   
		    // loop through the array
		    // using for each loop
		    System.out.println();
		    int[] age1 = {12, 4, 5,7,9};
		   
            System.out.println("Using for-each Loop:");
		    for(int a :age1) 
		    {
		     System.out.print(a+",");
		    }

	}
}
