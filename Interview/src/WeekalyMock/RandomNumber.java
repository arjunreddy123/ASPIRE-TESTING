package WeekalyMock;
import java.util.Random;
public class RandomNumber 
{
	
	 
	 
	 
	    public static void main(String[] args) 
	       {
	         System.out.println("============================");
	         System.out.println("Generating 10 random integer in range of 1 to 10 using Random");
	         System.out.println("============================");
	         Random randomGenerator=new Random();
	         for (int i = 0; i < 10; i++) 
	         {
	            System.out.print(randomGenerator.nextInt(10)+" ");
	         }
	 
	    }
	}




