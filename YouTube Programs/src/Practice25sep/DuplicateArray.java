package Practice25sep;

public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		  int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3,};   
          
	        System.out.println("Duplicate elements in given Array: ");  
	        
	        for(int i = 0; i < arr.length; i++) 
	        {  
	            for(int j = i + 1; j < arr.length; j++) 
	            {  
	                     if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	    }  
	}
//		int a[]= {10,20,30,4,20,10,20,10,30,10};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					System.out.print(a[i]+",");
//					break;
//				}
//				System.out.print("");
//		    }
//		}
//	}
//}


