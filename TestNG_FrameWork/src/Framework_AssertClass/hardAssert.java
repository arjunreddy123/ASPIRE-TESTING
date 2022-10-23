package Framework_AssertClass;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardAssert 
    {
       String username="arjun";
       String password="Aru123";
       String login="Ok";
       
       @Test
       public void disply()
       {
    	   Assert.assertEquals("arjun", username);
    	   System.out.println("usename match");
    	   Assert.assertEquals("arnav", password);
    	   System.out.println("password not match");
    	   Assert.assertEquals("Ok",login );
    	   System.out.println("login success");
       }
       @Test
       public void softassert() 
       {
    	   System.out.println();
    	   
    	   SoftAssert soft=new SoftAssert();
    	   
    	   soft.assertEquals("arjun", username);
    	   System.out.println("usename match");
    	   soft.assertEquals("arnav", password);
    	   System.out.println("password not match");
    	   soft.assertEquals("Ok",login );
    	   System.out.println("login success");
    	   soft.assertAll();
    	   
       }
       
    }
