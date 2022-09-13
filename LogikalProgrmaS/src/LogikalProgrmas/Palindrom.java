package LogikalProgrmas;

import java.util.Scanner;

//palindrom number 151
public class Palindrom 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter Any Number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
        int reminder;
        int reverse=0;
        int temp=num;
        
      
 
        while(num>0)
        {
        	reminder=num%10;   
            reverse=reverse*10+reminder;
            num=num/10;
        } 
        System.out.println(reverse);
        if(temp==reverse)
        {
        	System.out.println("Number is Palindrom");
        }
        else
        {
        	System.out.println("Number is Not Palindrom");
        }
       
       }
	}




