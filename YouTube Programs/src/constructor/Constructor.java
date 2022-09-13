package constructor;

public class Constructor 
{
	int a; 
	String b;
	int x;
	String y;
	 Constructor (int a, String name)
	{
		
	    this.a=100; this.b="arjun";
		this.x=a; this.y=name;
	}
	void show(int x,String y) 
	
	{
		System.out.println("a="+a +" "+"b=" +b);
		System.out.println("x=" +x+ " " +"y="+y);
	}
	public static void main(String[] args) 
	{
		Constructor ref=new Constructor(500,"Arjun");
        ref.show(10,"arjun");
		
        
	}

}
