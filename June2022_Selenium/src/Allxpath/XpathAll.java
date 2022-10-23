package Allxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAll 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="http://www.dypatil.edu/application-form/";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(2000);
		//Xpath by Attribute
		boolean img = driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
		System.out.println("Logo Display on Page ="+img);
		
		//Xpath By Text
		String text = driver.findElement(By.xpath("//h1[text()='School of Admission']")).getText();
		System.out.println("Name of School Text ="+text);
		
		//Xpath By Contains(Partial text)
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Per')]")).getText());
		
		 //xpath for Gender
         driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();
         boolean maleselect =driver.findElement(By.xpath("(//input[@name='gender'])[1]")).isSelected();
         System.out.println("maleoption selected="+maleselect);
         Thread.sleep(2000);
         //Gender
         driver.findElement(By.xpath("(//input[@name='category'])[1]")).click();
		//hostel reqired
         driver.findElement(By.xpath("(//input[@name='hostel_required'])[1]")).click();
         
         //date  dropdowan
         driver.findElement(By.xpath("//*[@type='date']")).sendKeys("02.09.2022");
         
         // Dropdown
         WebElement option = driver.findElement(By.xpath("//*[@id='school']"));
         Select s=new Select(option);
         //select by index(0)
         s.selectByIndex(3);
         Thread.sleep(3000);
         //select by value
         s.selectByValue("School of Pharmacy");
         Thread.sleep(3000);
         //select by visibletext
         s.selectByVisibleText("RAIT (School of Engineering )\r\n"
         		+ "                                ");
         Thread.sleep(3000);
         
         //Drop down for level
         WebElement leveloption = driver.findElement(By.xpath("//*[@name='level']"));
         Select l=new Select(leveloption);
         l.selectByIndex(2);
         
         //dropdown for course name
         WebElement course = driver.findElement(By.xpath("//*[@name='course_name']"));
         Select c=new Select(course);
         c.selectByIndex(1);
         
         //get all elements in list
         List<WebElement> allelements = s.getOptions();
         for(WebElement elements:allelements)
         {
         	System.out.println(elements.getText());
         }
         //default selected option
         System.out.println(s.getFirstSelectedOption().getText());
         
		
		//Xpath By Index
		driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Arjun");
		driver.findElement(By.xpath("(//input[@name='middle_name'])[1]")).sendKeys("Pandurang");
		driver.findElement(By.xpath("(//input[@placeholder='Surname'])[1]")).sendKeys("ugile");
        driver.findElement(By.xpath("(//input[@name='father_name'])[1]")).sendKeys("Pandurang");
        driver.findElement(By.xpath("(//input[@name='mother_name'])[1]")).sendKeys("Surekha");
        driver.findElement(By.xpath("(//input[@name='mother_tongue'])[1]")).sendKeys("HINDI");
        driver.findElement(By.xpath("(//input[@name='nationality'])[1]")).sendKeys("indian");
        driver.findElement(By.xpath("(//input[@name='religion'])[1]")).sendKeys("Maharashtra");
        driver.findElement(By.xpath("(//input[@name='blood_group'])[1]")).sendKeys("A++");
        driver.findElement(By.xpath("(//input[@name='address_line_one'])[1]")).sendKeys("House no=519");
        driver.findElement(By.xpath("(//input[@name='address_line_two'])[1]")).sendKeys("Udgir");
        driver.findElement(By.xpath("(//input[@name='address_state'])[1]")).sendKeys("Maharashtra");
        driver.findElement(By.xpath("(//input[@name='address_city'])[1]")).sendKeys("Udgir");
        driver.findElement(By.xpath("(//input[@name='address_district'])[1]")).sendKeys("Latur");
        driver.findElement(By.xpath("(//input[@name='address_pincode'])[1]")).sendKeys("413517");
        driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("arnav11@mail.com");
        driver.findElement(By.xpath("(//input[@name='mobile'])[1]")).sendKeys("7777777777");
        driver.findElement(By.xpath("(//input[@name='class_x_board_and_year'])[1]")).sendKeys("Latur board 2006");
        driver.findElement(By.xpath("(//input[@name='class_x_percentage_or_grade'])[1]")).sendKeys("75%");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[1]")).sendKeys("Marathi");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[2]")).sendKeys("Hindi");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[3]")).sendKeys("English");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[4]")).sendKeys("Mathematics");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[5]")).sendKeys("Scince");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[6]")).sendKeys("Physics");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[7]")).sendKeys("Chemistry");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[8]")).sendKeys("Physics");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[9]")).sendKeys("physics");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[10]")).sendKeys("Physics");
        driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[11]")).sendKeys("Physics");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//*[@type='number'])[1]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[2]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[3]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[4]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[5]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[6]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[7]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[8]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[9]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[10]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[11]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[12]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[13]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[14]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[15]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[16]")).sendKeys("70");
       driver.findElement(By.xpath("(//*[@type='number'])[17]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[18]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[19]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[20]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[21]")).sendKeys("70");
        driver.findElement(By.xpath("(//*[@type='number'])[22]")).sendKeys("70");
      Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[1]")).sendKeys("Biology");
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[2]")).sendKeys("Computer");
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[3]")).sendKeys("c++");
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[4]")).sendKeys("java");
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[5]")).sendKeys("HTML");
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[6]")).sendKeys("ORACL");
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[7]")).sendKeys("DATASCINCE");
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[8]")).sendKeys("C LANG");
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[9]")).sendKeys("LINUX");
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[10]")).sendKeys("UNIX");
        driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[11]")).sendKeys("SQL");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[1]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[2]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[3]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[4]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[5]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[6]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[7]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[8]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[9]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[10]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_total_marks[]'])[11]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[1]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[2]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[3]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[4]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[5]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[6]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[7]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[8]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[9]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[10]")).sendKeys("60");
        driver.findElement(By.xpath("(//*[@name='class_xii_marks_obtained[]'])[11]")).sendKeys("60");
        //Examination section
        driver.findElement(By.xpath("(//*[@name='other_exam_name'])[1]")).sendKeys("Mr. Parmod Sir");
        driver.findElement(By.xpath("(//*[@name='other_exam_year'])[1]")).sendKeys("2022");
        driver.findElement(By.xpath("(//*[@name='other_exam_marks_obtained'])[1]")).sendKeys("80");
        driver.findElement(By.xpath("(//*[@name='other_exam_percentile_obtained'])[1]")).sendKeys("70%");
        driver.findElement(By.xpath("(//*[@name='other_exam_rank_obtained'])[1]")).sendKeys("1");
        
       //Dclaration
        driver.findElement(By.xpath("//*[@type='checkbox']")).click();
        //submit button
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        System.out.println("==Thank You==");
	}

}
