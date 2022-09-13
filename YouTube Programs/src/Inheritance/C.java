package Inheritance;

public class C extends B
{
    void remi()
     {
	     c=a%b;
	     System.out.println("Reminder ofA &B is:"+c);
     }
    
        public static void main(String[] args) 
	{
		System.out.println("Enter value of A&B:");
		
		C r=new C ();
	
	    r.add();
        r.sub();
		r.multi();
		r.div();
		r.remi();
		
	}

	
}

