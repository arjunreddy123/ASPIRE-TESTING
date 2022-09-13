package Collections;

import java.util.ArrayDeque;
 
public class ArrayDeque_1 
{
         //**ArrayDeque use For FIFO
	public static void main(String[] args) 
	{
		//push N pop method also we can use in ArrayDeque 
		//we can also use add n remove in ArrayDeque
		ArrayDeque nm=new ArrayDeque();
		nm.push("Arjun");
		nm.push("Arnav");
		nm.push("Reddy");
		nm.push(77759777);       // push method use for add Element
		System.out.println(nm);
		nm.pop();                // pop method perform LIFO
		System.out.println(nm);
		

	}

}
