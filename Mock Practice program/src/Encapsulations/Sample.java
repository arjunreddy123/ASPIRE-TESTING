package Encapsulations;

public class Sample 
{
    private int UID;
    String Name;
    private long Acount_No; 
  
   Sample(int UID)           //constructor
   { 
	   this.UID=UID;
   }
   public void setmethod(String s,long a )     //setmethod as like normal method
   {
	   Name=s;
	   Acount_No=a;
   }
   public void getmethod()                   //getmethod as like normal method
   {
	   System.out.println("Name="+Name+"\n"+"Account Number="+Acount_No);
	   System.out.println("Adhaar Number=" +UID);
   }

}
