package element_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import element_pkg.BaseClass;

public class Add_clg extends BaseClass
{
	
	public static WebElement element=null;
	public Add_clg() 
	{
	super(driver);
	
     }
	
	
	
	
	public static class order
	{       
			public static WebElement user()
		     {
			   element=driver.findElement(By.id("username"));
			   return element;
		    }
	
			public static WebElement pwd()
		     {
			   element=driver.findElement(By.id("password"));
			   return element;
		    }
			
			public static WebElement Confirmpwd()
		     {
			   element=driver.findElement(By.id("password_confirm"));
			   return element;
		    }
			
			public static WebElement SelectCity()
		     {
			   element=driver.findElement(By.id("city"));
			   return element;
		    }
			
			public static WebElement CollegeName()
		     {
			   element=driver.findElement(By.id("institute"));
			   return element;
		    }
			
			
			public static WebElement AboutColleg()
		     {
			   element=driver.findElement(By.id("about_college"));
			   return element;
		    }
			
			public static WebElement Address()
		     {
			   element=driver.findElement(By.id("address"));
			   return element;
		    }
			
			public static WebElement pin()
		     {
			   element=driver.findElement(By.id("pincode"));
			   return element;
		    }
			
			public static WebElement phone()
		     {
			   element=driver.findElement(By.id("phone"));
			   return element;
		    }
			
			public static WebElement website()
		     {
			   element=driver.findElement(By.id("college_website"));
			   return element;
		    }
			

			public static WebElement University()
		     {
			   element=driver.findElement(By.id("university"));
			   return element;
		    }
			
			

			public static WebElement startdate()
		     {
			   element=driver.findElement(By.id("startday"));
			   return element;
		    }
			
			public static WebElement startmonth()
		     {
			   element=driver.findElement(By.id("startmonths"));
			   return element;
		    }
	
			public static WebElement enddate()
		     {
			   element=driver.findElement(By.id("endday"));
			   return element;
		    }
			
			public static WebElement endmonth()
		     {
			   element=driver.findElement(By.id("endmonths"));
			   return element;
		    }
			
			public static WebElement course()
		     {
			   element=driver.findElement(By.id("course"));
			   return element;
		    }
			
			public static WebElement specialization()
		     {
			   element=driver.findElement(By.id("spec"));
			   return element;
		    }
			

			public static WebElement Dean()
		     {
			   element=driver.findElement(By.id("dean"));
			   return element;
		    }
			
			public static WebElement AboutDean()
		     {
			   element=driver.findElement(By.id("about_dean"));
			   return element;
		    }
			
			
			
			public static WebElement placement_cordinator()
		     {
			   element=driver.findElement(By.id("coordinator"));
			   return element;
		    }
			
			
			public static WebElement contact()
		     {
			   element=driver.findElement(By.id("CONTACTLAND[]"));
			   return element;
		    }
			
			public static WebElement email()
		     {
			   element=driver.findElement(By.id("EMAIL[]"));
			   return element;
		    }
			
			
			public static WebElement submit()
		     {
			   element=driver.findElement(By.id("btnSubmitCollegeDetails"));
			   return element;
		    }
			
	
			
			
			
	
	
	}

}
