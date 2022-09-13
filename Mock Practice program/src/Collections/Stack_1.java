package Collections;
import java.util.Stack;

public class Stack_1 
{

	public static void main(String[] args) 
	{
		Stack nm=new Stack();
		nm.push("Arjun");
		nm.push("Arnav");
		nm.push("Reddy");
		nm.push(77759777);       // push method use for add Element
		System.out.println(nm);
		nm.pop();                // pop method perform to remove elemnt LIFO
		System.out.println(nm);
		
	}

}
