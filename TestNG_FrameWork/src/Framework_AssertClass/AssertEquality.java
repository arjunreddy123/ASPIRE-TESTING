package Framework_AssertClass;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquality 
{
	
	@Test
	public void  method()
	{
	Assert.assertEquals("Seleinim", "java","String differnt");
	}
	@Test
	public void  method1()
	{
	Assert.assertNotEquals("seleinim", "java","String are same");
	}
	@Test
	public void checknull()
	{
		Assert.assertNull(null);
		
	}
	@Test
	public void checknotnull()
	{
		Assert.assertNotNull("Seleinim");
	}

}
