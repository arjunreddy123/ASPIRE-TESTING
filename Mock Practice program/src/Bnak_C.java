
public class Bnak_C extends BANK
{

	   public void getbalnce(int balnce)
	     {
		   System.out.println("Bank C Balance is: "+balnce);
	     }
	   public static void main(String[] args) 
	   {
		   Bank_A a=new Bank_A();
		   Bank_B b=new Bank_B();
		   Bnak_C c=new Bnak_C();
		   
		   a.getbalnce(1000);
		   b.getbalnce(1500);
		   c.getbalnce(2000);
		   
		   
		   
	   }
}
