package com.aspire.java.Constructor;

public class DataBase 
{  //varibale declaration
	String name;
	int mobno;
	static String principlename;
	static String collagename;
	
	//varibale initialization
	DataBase()
	{
		
	}
	public void collagedata()
	{
		System.out.println("****Method Body****");
		System.out.println(name);
		System.out.println(mobno);
		System.out.println(principlename);
		System.out.println(collagename);
		
	}
	


	public static void main(String[] args) 
	{
		DataBase Arjun=new DataBase ();
		Arjun.name="Arjun ugile";
		Arjun.mobno=901115966;
		DataBase.collagename="COEP";
		DataBase.principlename="ugile";
		
		DataBase vaishali=new DataBase();
		vaishali.name="vaishali";
		vaishali.mobno=994206411;
		//method call
		Arjun.collagedata();
		vaishali.collagedata();
		

	}

}
