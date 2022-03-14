package b.dropDownHandling15thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDeselectMethodEx2 {
	
	public static void main (String [] args) throws InterruptedException {
		
	
	System.setProperty( "webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver ();
	driver.manage().window().maximize();
	
	driver.get("https://twitter.com/i/flow/signup");
	Thread.sleep(5000);

	driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])")).sendKeys("hiiii");
	Thread.sleep(3000);
	
	driver.findElement(By.name("phone_number"));
	Thread.sleep(3000);

	WebElement ele = driver.findElement(By.xpath("(//select[@aria-invalid = 'false'])[1]"));
	Select s = new Select(ele);
	s.selectByVisibleText("May");
	Thread.sleep(3000);
	//s.deselectByVisibleText("May");										// not possible due to page 
	//Thread.sleep(3000);

	//(//select[@aria-labelledby = 'SELECTOR_2_LABEL'])
	WebElement ele1 = driver.findElement(By.id("SELECTOR_2"));
	Select s1 = new Select(ele1);
	s1.selectByIndex(14);
	Thread.sleep(3000);
	//s1.deselectByIndex(14);												// not possible due to page 
	//Thread.sleep(3000);

	WebElement ele2 = driver.findElement(By.id("SELECTOR_3"));
	Select s2 = new Select(ele2);
	s2.selectByVisibleText("1996");
	Thread.sleep(3000);
	//s2.deselectByVisibleText("1996");									// not possible due to page 
	//Thread.sleep(3000);
	
	driver.quit();

	
	
	
	
	}
}
