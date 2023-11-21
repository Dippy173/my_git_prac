package prasad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		 ChromeOptions op = new ChromeOptions();
		 op.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(op);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.gmail.com/");
		 driver.findElement(By.id("identifierId")).sendKeys("prasad.17.us@gmail.com"); 
		 driver.findElement(By.id("identifierNext")).click();
		 String at = driver.getTitle();
		 String et = "gmail";
		 if(at.equalsIgnoreCase(et))
		 {
			 System.out.println("Test successful");
		 }
		 else
		 {
			 System.out.println("Test unsuccessful");
		 }
		 
			}

}
