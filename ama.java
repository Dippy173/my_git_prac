package Dip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ama {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		 ChromeOptions op = new ChromeOptions();
		 op.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(op);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.amazon.in/");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco f1");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 String at = driver.getTitle();
		 String et = "amazon";
		 if(at.equalsIgnoreCase(et))
		 {
			 System.out.println("Test Successful");
		 }
		 else
		 {
			 System.out.println("Test Failure");
		 }
			 
	}

}
