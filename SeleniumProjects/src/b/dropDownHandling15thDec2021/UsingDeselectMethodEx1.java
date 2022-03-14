package b.dropDownHandling15thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDeselectMethodEx1 {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name = 'keyword']")).sendKeys("Automation Engineer");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name = 'location']")).sendKeys("Pune");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class = 'btn']")).click();
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("//span[@title = 'Pune']"));
		Select s = new Select(ele);
		s.selectByVisibleText("Pune");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
	}
	
}
