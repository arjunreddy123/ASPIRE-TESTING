package Practicepack;

import java.util.Scanner;

public class Arrrayscanner 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Array elemnt:=");
		Scanner s=new Scanner(System.in);
		int a[][]=new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.print("Matrix:"+"\n");
		for(int i=0;i<=a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
