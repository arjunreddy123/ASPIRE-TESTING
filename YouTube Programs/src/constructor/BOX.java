package constructor;

public class BOX 
{
	//int height,width,depth;
	int a,b,c;
	BOX()
	{
		
	}
//	BOX()
//	{
//
//		//this.height=5;
//		///this.depth=2;
//		//this.width=2;
//  }
//	BOX(int height,int width,int depth) 
//      {
//
//        this.height=height;
//	    this.width=width;
//	    this.depth=depth;
//		
//	}
	public void disply()
	{
		//System.out.println("volume is="  +(height*depth*width));
		System.out.println(a+""+b +""+c);
	}
	
//
//	void volume()
//    {
//		 System.out.println("Height:"+height);
//		 System.out.println("width:" +width);
//		 System.out.println("dDepth:"+depth);
//
//		int volume = height*depth*width;
//       System.out.println("Volume is:"+volume);
//	   //System.out.println("height:"+height);
//	
//	}
	

	public static void main(String[] args) 
	{
		BOX b1=new BOX();
		b1.a=10;
		System.out.println(b1.a);
		
		//BOX b=new BOX(10,5,5);
		//b1.disply();
		  //BOX b1=new BOX();
		 //b.volume();
		  //b1.volume();

	}

}
