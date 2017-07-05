package test_pkg;

import org.openqa.selenium.interactions.Action;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Action_pkg.addDataAction;
import Action_pkg.addDataAction;
import element_pkg.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Util;
//import org.apache.log4j.xml.DOMConfigurator;


public class Framework {
	public WebDriver driver;
	private int iTestCaseRow;
	private String sTestCaseName;
	@BeforeMethod
	public void beforemethod() throws Exception
	{	
		
		//sTestCaseName = this.toString();
		sTestCaseName = Util.getTestCaseName(this.toString());
		//Log.startTestCase(sTestCaseName);
        System.out.println(sTestCaseName);
		ExcelUtils.setexcelfile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		iTestCaseRow = ExcelUtils.getrowcontains(sTestCaseName,Constant.Col_TestCaseName);
		System.out.println("row count is" +iTestCaseRow);
		driver = Util.openbrowser(3);
		new element_pkg.BaseClass(driver);  
	}
	
	 @Test		
	 public void main() throws Exception	
	 {
		try
		{
		 addDataAction.report(iTestCaseRow);
		 
		}
		catch(Exception e)
		{
			//Log.error(e.getMessage());
			//Utils.getscreenshot();
		}
	 }
 
}
