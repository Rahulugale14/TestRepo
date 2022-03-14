package d.frameHandling17thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandlingEx3 {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		WebElement ele = driver.findElement(By.id("selectnav1"));
		Select s = new Select(ele);
		s.selectByVisibleText("-- Automation Testing");
		Thread.sleep(3000);
		
		
		
		// try using below codes & eliminate selectByVisibileText above
/*
		driver.findElement(By.xpath("//input[@id = 'firstName']")).sendKeys("Rahul");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys("Ugale");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'malerb']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'englishchbx']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'hindichbx']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("rahul.amol.710@gmail.com");
		Thread.sleep(3000);

*/
		driver.quit();
		
		
	}
}
