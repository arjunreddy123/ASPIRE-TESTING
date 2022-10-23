package Framework_INCLUDEEXCLUDE;

import org.testng.annotations.Test;
// Suit-test-group-class-method-include
public class Groupes 
{
	
@Test
public void Auto() 
{
	System.out.println("Method1 ");
}
@Test(groups="job",priority=1)
public void IT() 
{
	System.out.println("Method2 ");
}
@Test(groups="job",priority=2)
public void PHARMA() 
{
	System.out.println("Method3 ");
}
@Test(groups="job",priority=3)
public void BANK() 
{
	System.out.println("Method4 ");
}
@Test
public void login() 
{
	System.out.println("Method5 ");
}
}
/*
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
  <groups>
  <run>
  <include name ="job"/>
  </run>
  </groups>
    <classes>
      <class name="Framework_INCLUDEEXCLUDE.Groupes"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

 */
