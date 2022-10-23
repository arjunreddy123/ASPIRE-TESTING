package Framework_INCLUDEEXCLUDE;

import org.testng.annotations.Test;

public class Includeexclude_1 
{
	
@Test(enabled=false)
public void method1() 
{
	System.out.println("Method1 ");
}
@Test
public void method2() 
{
	System.out.println("Method2 ");
}
@Test
public void method3() 
{
	System.out.println("Method3 ");
}

}
/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="Framework_INCLUDEEXCLUDE.Includeexclude_1">
      <methods>
      <include name="method1"/>
      <exclude name="method3"/>
      </methods>
      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
*/
