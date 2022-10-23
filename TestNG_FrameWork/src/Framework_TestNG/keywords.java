package Framework_TestNG;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywords 
{

	
	    //private static final String[] login = null;
		
	    @Test(invocationCount=2)
	    
		public void method2()
		{
			Reporter.log("Method 2", true);
		}
	    @Test
	    public void method1()
		{
			Reporter.log("Browserlunch",true);
			Reporter.log("URL enter",true);
			Reporter.log("Home Page",true);
		}
	    @Test (enabled=false)
		public void method3()
		{
	    	Reporter.log("Method 3", true);
		}
	    
	    @Test (timeOut=5000)
		public void method4() throws InterruptedException 
		{
	    	Thread.sleep(3000);
			Reporter.log("Method 4",true);	
		}
	    @Test 
	    public void login() 
	    {
	    	Assert.fail();
	    	Reporter.log("Login Succesful",true);
	    }
	    @Test (dependsOnMethods="login")//multiple methods astil tnewa {} use karych; 
	    public void logout()
	    {
	    	Reporter.log("logout succesful",true);
	    }
	   
	    

	}
//1.priority
//2.enabled => by default=true 
//3.invocationCount => 1 by default
//4.timeout => need more time than sleeptime
//   	  => if less time gives error
//5.dependsOnMethod -> logout id depends on login page 
//					->(skipped logout code if login code fails)
//Assert.fail => // static method-> fail the method intentionally
//Reporting.log -> printing in report -> like logs
