package d.frameHandling17thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandlingEx1 {															// General Frames

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("Hello");
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));	
		WebElement ele = driver.findElement(By.id("course"));
		Select s = new Select(ele);
		s.selectByVisibleText("Java");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys(" World");
		Thread.sleep(3000);

	}
}
