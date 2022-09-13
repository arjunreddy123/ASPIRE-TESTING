import java.util.Scanner;

public class UserInput
{

	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String name=S.next();
		System.out.println("Enter Your Age:");
		int age=S.nextInt();
		System.out.println("Enter Your Gender:");
		char gender=S.next().charAt(0);
		//String gender=S.next();
		System.out.println("Enter Your phone No:");
		long phoneno=S.nextLong();
		System.out.println("--------------------------------------");
		System.out.println("Name:"+name);
		System.out.println("Name:"+age);
		System.out.println("Name:"+gender);
		System.out.println("Name:"+phoneno);
		
		
		
		

	}

}
