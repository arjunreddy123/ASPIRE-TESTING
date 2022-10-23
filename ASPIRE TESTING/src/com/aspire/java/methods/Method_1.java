package com.aspire.java.methods;

public class Method_1 
{
       public static void Add()
        {
    	   int a=10,b=20;
    	   System.out.println("Sum="+(a+b));
    	}
       public static void Disp() 
       {
    	   System.out.println("Learning java");
       }
        void classname()
       {
    	   System.out.println("Aspire Institute");
       }
       
public static void main(String[] args) 
	{
	Method_1.Add();
	Method_1.Disp();
	Method_1 obj=new Method_1 ();
	obj.classname ();

	}

}
