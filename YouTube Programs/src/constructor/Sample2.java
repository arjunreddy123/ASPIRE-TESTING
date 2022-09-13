package constructor;

public class Sample2 extends Sample
{
	
	Sample2(int c, int d)	
	    {
		
        //super(120,130);
        System.out.println("I am child Constructor");
		a=c;
		b=d;	
		}
	public static void main(String[] args) 
	{
		Sample ob1= new Sample(100,200);
//		ob1.addition();			//150
//		ob1.multiplication();
//		//ob1.Sample(10,20);//5000
		
		
		 Sample2 ob=new Sample2(25,25);
		ob.addition();			//30
	    ob.multiplication();
	    ob.show();
	    
		
		//200
		
	}
}