package constructor;

public class CallsecondConstructor 
{
	 int sum;

	                                              // first constructor
	 CallsecondConstructor () 
	 {
		 this(5, 2);                                  // calling the second constructor
	    
	 }

	                                             // second constructor
	 CallsecondConstructor (int arg1, int arg2) 
	 {
		 this.sum = arg1 + arg2;                                      // add two value
	   
	 }

	 public void display() 
	  {
	    System.out.println("Sum is: " + sum);
	  }

	  
	  public static void main(String[] args) 
	  {

	      CallsecondConstructor  obj = new CallsecondConstructor ();
          obj.display();
	  }
	}
  

