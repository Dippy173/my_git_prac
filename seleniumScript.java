package dippy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumScript {

	public static void main(String[] args) {
	
 System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
 ChromeOptions op = new ChromeOptions();
 op.addArguments("--disable-notifications");
 WebDriver driver = new ChromeDriver(op);
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.get("https://www.facebook.com/login/");
 driver.findElement(By.id("email")).sendKeys("xyz@gmail.com"); //enter facebook email-id
 driver.findElement(By.id("pass")).sendKeys("********"); //enter Facebook password
 driver.findElement(By.name("login")).click();
 
	}

}
