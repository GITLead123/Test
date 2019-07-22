package ThirdRound.ThirdMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static WebDriver driver;
	//enter URL
	public static WebDriver getDriver(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}
	
	//take screenshot
public static void takeScreenshot(WebDriver driver,String filename) throws IOException
{
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
	File desfile = new File("C:\\Malar\\Selenium\\Screenshots"+filename+".jpeg");
	FileUtils.copyFile(srcfile, desfile);
			
}

//enter text
public static void typeValue(WebElement ele,String value)
{
	ele.sendKeys(value);
}

//click
public static void operationClick(WebElement ele)
{
ele.click();	
}
}
