package LogikalProgrmas;

public class Square 
{
         public static void method(int side)
            {
	      int area=side*side;
	      System.out.println("Area of Sequre is="+area);
	        }
         
          public static void method(int length,int breadth )
            {
    	   int side=length*breadth;
    	   System.out.println("Area of Reactangle is="+side);
            }
       
	public static void main(String[] args) 
	    {
		method(10);
		method(5, 5);
	    }
	}
