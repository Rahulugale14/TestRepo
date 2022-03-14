package b.dropDownHandling15thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsHandling15thDec2021 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?r=101");
		
		driver.findElement(By.xpath("//input[@type = 'text'][1]")).sendKeys("Hello");
		
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
		Select s = new Select(day);
		//s.selectByVisibleText("14");		// most preferable way
		//s.selectByIndex(13);
		s.selectByValue("14");
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name = 'birthday_month']"));
		Select m = new Select(month);
		m.selectByVisibleText("May");		// most preferable way
		//m.selectByIndex(13);
		//m.selectByValue("14");
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
