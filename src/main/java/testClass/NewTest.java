package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
public static void main(String[] args) {
	  try {
			WebDriver driver;			  
			System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");	
			//driver.navigate().refresh();
			driver = new FirefoxDriver();			
			driver.get("http://hml.vexter.com.br/login");
			Thread.sleep(2000);
			driver.manage().window().maximize();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
			  
  }
}
