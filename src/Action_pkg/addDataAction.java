package Action_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;





//import Element_pkg.Newcustomer;
import element_pkg.BaseClass;
import element_pkg.Add_clg;
import utility.Constant;
import utility.ExcelUtils;
//import Utility.Log;
import utility.Util;


public class addDataAction 
{
	
	public static WebDriver driver=null;
	
	
	@Test
	  public static void report(int iTestCaseRow ) throws Exception 
	  {
		Add_clg.order.user().click();
		String username=ExcelUtils.getcelldata(iTestCaseRow, Constant.col_Username);
		System.out.println(username);
		 Add_clg.order.user().sendKeys(username);
		 
		 
		 String pwd=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_pwd);
		 Add_clg.order.pwd().sendKeys(pwd);
		 
		 String Cpwd=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_CPwd);
		 Add_clg.order.pwd().sendKeys(Cpwd);
		 
		 String City=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_City);
		 Add_clg.order.pwd().sendKeys(Cpwd);
		 
		 
		 
		 
		 
		
		
	  }

}
