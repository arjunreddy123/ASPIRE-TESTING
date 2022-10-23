package Framework_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample_1 
{
		@Test
		public void A()
		{
			System.out.println("Method 1");
		}
		@AfterClass
		public void B()
		{
			System.out.println("Method 2");
		}
		@BeforeClass
		public void C()
		{
			System.out.println("Method 3");
		}
		@AfterSuite
		public void D()
		{
			System.out.println("Method 4");
		}
		@BeforeSuite
		public void E()
		{
			System.out.println("Method 5");
		}
	

	}

