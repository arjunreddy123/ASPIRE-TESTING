package Practicepack;

public class arraysum 
{

	public static void main(String[] args) 
	{
		int number[]= {7,2,5,42,1,2,54,2,1,0,2,2,-20};
		int sum=0;
		double average;
		for( int temp:number)
		{
			sum+=temp;
		}
      System.out.println("sum="+sum);
      int length=number.length;
      average=sum/length;
      System.out.println("average="+average);
	}

}
