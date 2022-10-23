package Framework_AssertClass;

import org.testng.annotations.Test;

import graphql.Assert;

public class AssertConditions 
    {
    	boolean abc=true;
    	@Test
    	public void method1()
    	{
    		Assert.assertTrue(abc);
    	}
    	@Test
    	public void method2()
    	{
    		Assert.assertFalse(abc);
    	}

    }
