package Abstraction;

abstract public class Fruit 
{
	 int a=10,b=20,c;
     abstract public void Test();         //incomplete method/abstract method
     abstract public void Color();
     
     private void addition()              //complet method
     {
	  c=a+b;
	 System.out.println(c);
     }
    public static void substraction()
     {
    	int x=20,y=30,z;
    	z=x-y;
   	   System.out.println(z);
    	
     }
    
 
}
